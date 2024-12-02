import { useState, useEffect } from 'react';

export function useProducts(apiUrl) {
  const [produtos, setProdutos] = useState([]);

  const fetchProdutos = async () => {
    try {
      const response = await fetch(apiUrl);
      const data = await response.json();
      setProdutos(data);
    } catch (error) {
      console.error('Erro ao carregar os produtos:', error);
    }
  };

  const deleteProduct = async (id) => {
    const isConfirmed = window.confirm('Você tem certeza que deseja excluir este produto?');
    if (!isConfirmed) return;

    try {
      await fetch(`${apiUrl}/${id}`, { method: 'DELETE' });
      setProdutos((prev) => prev.filter((produto) => produto.id !== id));
    } catch (error) {
      console.error('Erro ao excluir o produto:', error);
    }
  };

  useEffect(() => {
    fetchProdutos();
  }, [apiUrl]);

  return { produtos, deleteProduct };
}



import React, { useState, useEffect } from 'react'; 
import { useParams, Link } from 'react-router-dom';
import './ProductDetailsStyle.css';

function ProductDetails() {
  const { id } = useParams();
  const [produto, setProduto] = useState(null);

  useEffect(() => {
    const fetchProduto = async () => {
        try {
            const response = await fetch(`http://localhost:3001/products/${id}`);
            const data = await response.json();
            setProduto(data);
        } catch (error) {
            console.error('Erro ao carregar o produto:', error);
        }
        };
        fetchProduto();
    }, [id]);

    if (!produto) {
        return <p>Carregando...</p>;
    }

    return (
        <div className="product-details">
          <h1>{produto.name}</h1>
          <img src={produto.photo_url} alt={produto.name} className="product-image" />
          <p><strong>Preço:</strong> R${produto.price.toFixed(2)}</p>
          <p><strong>Descrição:</strong> {produto.description}</p>
          <Link to="/produtos" className="back-button">Voltar à Lista</Link>
        </div>
      );
  
}

export default ProductDetails;
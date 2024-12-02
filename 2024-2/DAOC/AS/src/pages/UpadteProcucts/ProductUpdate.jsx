import React, { useEffect, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import './UpdateProductsStyle.css';

function ProductUpdate() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [product, setProduct] = useState({
    name: '',
    price: '',
    photo_url: '',
  });

  useEffect(() => {
    const fetchProduct = async () => {
      const response = await fetch(`http://localhost:3001/products/${id}`);
      const data = await response.json();
      setProduct(data);
    };
    fetchProduct();
  }, [id]);

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setProduct((prev) => ({ ...prev, [name]: value }));
  };

  const handleFormSubmit = async (event) => {
    event.preventDefault();
    await fetch(`http://localhost:3001/products/${id}`, {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(product),
    });
    navigate('/produtos');
  };

  return (
    <div className="update-product">
      <h1>Editar Produto</h1>
      <form onSubmit={handleFormSubmit}>
        <label>Nome:</label>
        <input type="text" name="name" value={product.name} onChange={handleInputChange} required />
        <label>Preço:</label>
        <input type="number" name="price" value={product.price} onChange={handleInputChange} required />
        <label>URL da Imagem:</label>
        <input type="url" name="photo_url" value={product.photo_url} onChange={handleInputChange} required />
        <button type="submit">Salvar Alterações</button>
      </form>
    </div>
  );
}

export default ProductUpdate;

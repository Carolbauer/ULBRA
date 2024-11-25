import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import "./FormsCadastrarStyle.css";


function FormsCadastrar({ setProdutos }) {
  const [name, setName] = useState('');
  const [price, setPrice] = useState('');
  const [description, setDescription] = useState('');
  const [photo, setPhoto] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();

    const novoProduto = {
      name,
      price: parseFloat(price) || 0,
      description,
      photo_url: photo,
    };

    try {
      const response = await fetch('http://localhost:3001/products', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(novoProduto),
      });

      if (!response.ok) {
        throw new Error('Erro ao cadastrar o produto');
      }

      const produtoCriado = await response.json();
      setProdutos((prevProdutos) => [...prevProdutos, produtoCriado]);
      navigate('/produtos');
    } catch (error) {
      console.error('Erro ao cadastrar o produto:', error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>Nome:</label>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
      </div>
      <div>
        <label>Preço:</label>
        <input
          type="number"
          step="0.01"
          value={price}
          onChange={(e) => setPrice(e.target.value)}
          required
        />
      </div>
      <div>
        <label>Descrição:</label>
        <textarea
          value={description}
          onChange={(e) => setDescription(e.target.value)}
          required
        />
      </div>
      <div>
        <label>Foto (URL):</label>
        <input
          type="text"
          value={photo}
          onChange={(e) => setPhoto(e.target.value)}
          required
        />
      </div>
      <button type="submit">Cadastrar Produto</button>
    </form>
  );
}

export default FormsCadastrar;

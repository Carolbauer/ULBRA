import React from 'react';

function ListProdutos({ produtos }) {
  if (!produtos || produtos.length === 0) {
    return <p>Nenhum produto cadastrado ainda.</p>;
  }

  return (
    <div className="pessoas-container">
      <h1>Produtos Cadastrados</h1>
      <ul>
        {produtos.map((produto, index) => (
          <li key={index}>
            <strong>Nome:</strong> {produto.name} <br />
            <strong>Preço:</strong> R${produto.price ? produto.price.toFixed(2) : "N/A"} <br />
            <strong>Descrição:</strong> {produto.description} <br />
            <strong>Foto:</strong> <img src={produto.photo_url} alt={produto.name} width="100" />
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListProdutos;

import React from "react";
import { useNavigate } from "react-router-dom";
import { FaTrash, FaEdit, FaEye } from "react-icons/fa";
import "./ProductList.css";
import { useProducts } from "../../hooks/useProducts";

function ListProdutos({ produtos, setProdutos }) {
  const urlApi = "http://localhost:3001/products";
  const {produtos, deleteProduct} = useProducts(apiUrl);
  const navigate = useNavigate();

  if (!produtos || produtos.length === 0) {
    return <p className="no-products">Nenhum produto cadastrado ainda.</p>;
  }

  return (
    <div className="products-list">
      <h1>Produtos Cadastrados</h1>
      <div className="products-container">
        {produtos.map((produto) => (
          <div className="product-card" key={produto.id}>
            <img
              src={produto.photo_url}
              alt={produto.name}
              className="product-image"
            />
            <div className="product-info">
              <h3 className="product-name">{produto.name}</h3>
              <p className="product-price">
                R${produto.price ? Number(produto.price).toFixed(2) : "0.00"}
              </p>
            </div>
            <div className="product-actions">
              <button
                className="view-button"
                onClick={() => viewProductDetails(produto.id)}
                aria-label="Ver Detalhes"
              >
                <FaEye />
              </button>
              <button
                className="edit-button"
                onClick={() => editProduct(produto.id)}
                aria-label="Editar Produto"
              >
                <FaEdit />
              </button>
              <button
                className="delete-button"
                onClick={() => deleteProduct(produto.id)}
                aria-label="Excluir Produto"
              >
                <FaTrash />
              </button>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default ListProdutos;

import React from "react";
import { useNavigate } from "react-router-dom";
import { FaTrash, FaEdit, FaEye } from "react-icons/fa";
import "./ProductList.css";
import { useProducts } from "../../hooks/useProducts";

function ListProdutos({ setProdutos }) {
    const apiUrl = "http://localhost:3001/products";
    const { produtos: fetchedProdutos, deleteProduct } = useProducts(apiUrl);
    const navigate = useNavigate();

    if (!fetchedProdutos || fetchedProdutos.length === 0) {
        return <p className="no-products">Nenhum produto cadastrado ainda.</p>;
    }

    return (
        <div className="products-list">
            <h1>Produtos Cadastrados</h1>
            <div className="products-container">
                {fetchedProdutos.map((produto) => (
                    <div className="product-card" key={produto.id}>
                        <img
                            src={produto.photo_url}
                            alt={produto.name}
                            className="product-image"
                        />
                        <div className="product-info">
                            <h3 className="product-name">{produto.name}</h3>
                            <p className="product-price">
                                R$ {typeof produto.price === "number" ? produto.price.toFixed(2) : "0.00"}
                            </p>
                        </div>
                        <div className="product-actions">
                            <button
                                className="view-button"
                                onClick={() => navigate(`/produtos/detalhes/${produto.id}`)}
                            >
                                <FaEye />
                            </button>
                            <button
                                className="edit-button"
                                onClick={() => navigate(`/produtos/editar/${produto.id}`)}
                            >
                                <FaEdit />
                            </button>
                            <button
                                className="delete-button"
                                onClick={() => deleteProduct(produto.id)}
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

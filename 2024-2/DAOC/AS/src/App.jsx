import { BrowserRouter, Route, Routes, Navigate } from 'react-router-dom';
import './App.css';
import HomePage from './pages/HomePage/HomePage';
import MainLayout from './layout/MainLayout';
import ProductLayout from './layout/ProductLayout';
import React, { useState, useEffect } from 'react';
import ProdutoCadastrar from './pages/ProductCreate/ProdutoCadastrar';
import ListProdutos from './pages/ProductList/ListProdutos';
import ProductDetails from './pages/ProductsDetails/ProductDetails';
import ProductUpdate from './pages/UpadteProcucts/ProductUpdate';
import About from './pages/About';

function App() {
  const [produtos, setProdutos] = useState([]);

 
  useEffect(() => {
    const fetchProdutos = async () => {
      try {
        const response = await fetch('http://localhost:3001/products'); 
        const data = await response.json();
        setProdutos(data);
      } catch (error) {
        console.error('Erro ao carregar os produtos:', error);
      }
    };

    fetchProdutos();
  }, []);

  const updateProductList = (updatedProduct) => {
    setProdutos((prevProdutos) =>
      prevProdutos.map((produto) =>
        produto.id === updatedProduct.id ? updatedProduct : produto
      )
    );
  };
  

  
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<MainLayout />}>
        <Route index element={<HomePage />} />
          <Route path="/home" index element={<HomePage />} />
          <Route path="/sobre" element={<About />}/>
          <Route
            path="/produto/cadastrar"
            element={<ProdutoCadastrar setProdutos={setProdutos} />}
          />
          <Route
            path="/produtos"
            element={<ListProdutos produtos={produtos} setProdutos={setProdutos} />}
          />
        </Route>
        <Route
  path="/produtos/editar/:id"
  element={<ProductUpdate updateProductList={updateProductList} />}
/>

        <Route path = "/produtos/detalhes/:id" element={<ProductDetails/>} />


        <Route path="/produto" element={<ProductLayout />}>
          <Route index element={<h2>Descrição</h2>} />
          <Route path="/produto/descricao" element={<h2>Descrição</h2>} />
          <Route path="/produto/preco" element={<h2>Preço</h2>} />
        </Route>

        <Route path="*" element={<h2>Tela de erro</h2>} />
        
      </Routes>
    </BrowserRouter>
  );
}

export default App;

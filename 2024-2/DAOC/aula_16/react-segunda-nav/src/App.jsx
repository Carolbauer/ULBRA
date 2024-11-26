import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import HomePage from './pages/HomePage';
import SobrePage from './pages/SobrePage';
import MainLayout from './layout/MainLayout';
import ProductLayout from './layout/ProductLayout';
import React, { useState, useEffect } from 'react';
import ProdutoCadastrar from './pages/ProdutoCadastrar';
import ListProdutos from './pages/ListProdutos';

function App() {
  const [produtos, setProdutos] = useState([]);

  // Carregar os produtos ao iniciar a aplicação
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

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<MainLayout />}>
          <Route path="/home" element={<HomePage />} />
          <Route path="/sobre" element={<SobrePage />} />
          <Route
            path="/produto/cadastrar"
            element={<ProdutoCadastrar setProdutos={setProdutos} />}
          />
          <Route
            path="/produtos"
            element={<ListProdutos produtos={produtos} />}
          />
        </Route>

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

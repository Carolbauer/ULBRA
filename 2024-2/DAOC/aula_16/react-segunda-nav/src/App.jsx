import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import HomePage from './pages/HomePage';
import SobrePage from './pages/SobrePage';
import ContatoPage from './pages/ContatoPage';
import PessoasPage from './pages/PessoasPage';
import MainLayout from './layout/MainLayout';
import ProductLayout from './layout/ProductLayout';
import React, { useState } from 'react';

function App() {
  const [pessoas, setPessoas] = useState([]);

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<MainLayout />}>
          <Route path="/home" element={<HomePage />} />
          <Route path="/sobre" element={<SobrePage />} />
          <Route path="/contato" element={<ContatoPage pessoas={pessoas} setPessoas={setPessoas} />} />
          <Route path="/pessoas" element={<PessoasPage pessoas={pessoas} />} />
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

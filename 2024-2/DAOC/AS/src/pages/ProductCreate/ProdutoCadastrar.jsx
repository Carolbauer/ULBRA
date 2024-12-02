import React from 'react';
import { useNavigate } from 'react-router-dom';
import FormsCadastrar from '../../components/Forms/FormsCadastrar';


function ProdutoCadastrar({ setProdutos }) {
  const navigate = useNavigate();

  return (
    <>
      <h1>Cadastre o Produto</h1>
      <FormsCadastrar setProdutos={setProdutos} />
      <button onClick={() => navigate('/home')}>Home</button>
    </>
  );
}

export default ProdutoCadastrar;

import React from "react";

function PessoasPage({ pessoas }) {
  return (
    <div className="pessoas-container">
      <h1>Pessoas Cadastradas</h1>
      {pessoas.length > 0 ? (
        <ul>
          {pessoas.map((pessoa, index) => (
            <li key={index}>
              <strong>Nome:</strong> {pessoa.nome} <br />
              <strong>Email:</strong> {pessoa.email} <br />
              <strong>Mensagem:</strong> {pessoa.mensagem}
            </li>
          ))}
        </ul>
      ) : (
        <p>Nenhuma pessoa cadastrada ainda.</p>
      )}
    </div>
  );
}

export default PessoasPage;

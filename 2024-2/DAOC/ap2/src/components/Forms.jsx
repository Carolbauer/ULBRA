import React, { useState } from 'react';

function Forms({ onSubmit }) {
  const [name, setName] = useState('');
  const [telefone, setTelefone] = useState('');
  const [email, setEmail] = useState('');
  const [egresso, setEgresso] = useState(''); 
  const [pago, setPago] = useState('');       
  const [foto, setFoto] = useState('');

  const validateForm = () => {
    const isValid = name && telefone && email && egresso && pago && foto;
    if (!isValid) {
      alert('Preencha todos os campos');
      return false;
    }
    return true;
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    onSubmit({
      name,
      telefone,
      email,
      egresso: egresso === 'Sim' ? 'Egresso/Convidado' : 'Estudante',
      pago: pago === 'Sim' ? 'Confirmado' : 'Não confirmado',
      foto
    });

    setName('');
    setTelefone('');
    setEmail('');
    setEgresso(''); 
    setPago('');  
    setFoto('');
  };

  return (
    <div>
      <header>
        <section>
          <h1>Preencha os dados</h1>
          <form onSubmit={handleSubmit}>
            <label htmlFor="name">Nome:</label>
            <input 
              type="text" 
              id="name" 
              name="name"
              value={name}
              onChange={(e) => setName(e.target.value)}
              required
            />

            <label htmlFor="telefone">Telefone:</label>
            <input 
              type="text" 
              id="telefone" 
              name="telefone"
              value={telefone}
              onChange={(e) => setTelefone(e.target.value)}
              required
            />

            <label htmlFor="email">Email:</label>
            <input 
              type="email" 
              id="email" 
              name="email"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              required
            />

            <label htmlFor="egresso">Egresso/Convidado:</label>
            <div>
              <input 
                type="radio" 
                id="egressoSim" 
                name="egresso" 
                value="Sim" 
                checked={egresso === 'Sim'} 
                onChange={(e) => setEgresso(e.target.value)}
              />
              <label htmlFor="egressoSim">Sim</label>

              <input 
                type="radio" 
                id="egressoNao" 
                name="egresso" 
                value="Não"
                checked={egresso === 'Não'} 
                onChange={(e) => setEgresso(e.target.value)}
              />
              <label htmlFor="egressoNao">Não</label>
            </div>

            <label htmlFor="pago">Pago:</label>
            <div>
              <input 
                type="radio" 
                id="pagoSim" 
                name="pago" 
                value="Sim" 
                checked={pago === 'Sim'}
                onChange={(e) => setPago(e.target.value)}
              />
              <label htmlFor="pagoSim">Sim</label>

              <input 
                type="radio" 
                id="pagoNao" 
                name="pago" 
                value="Não"
                checked={pago === 'Não'} 
                onChange={(e) => setPago(e.target.value)}
              />
              <label htmlFor="pagoNao">Não</label>
            </div>

            <label htmlFor="foto">Foto (URL):</label>
            <input 
              type="text" 
              id="foto" 
              name="foto"
              value={foto}
              onChange={(e) => setFoto(e.target.value)}
              placeholder="URL da foto"
              required
            />

            <button type="submit">Cadastrar</button>
          </form>
        </section>
      </header>
    </div>
  );
}

export default Forms;

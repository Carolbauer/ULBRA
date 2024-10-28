import React, { useState } from "react";
import Forms from "./Forms";
import Header from "./Header";
import { useFetch } from "../hooks/useFetch";  
import Footer from "./Footer";

const AllInfos = (props) => {
  const [participants, setParticipants] = useState([]);
  const [showLocation, setShowLocation] = useState(false); 


  const { data: locationData } = useFetch("https://viacep.com.br/ws/95560000/json/");


  const addParticipant = (participant) => {
    setParticipants([...participants, participant]);
  };


  const toggleLocation = () => {
    setShowLocation((prevShowLocation) => !prevShowLocation); 
  };

  return (
    <div className="all-infos-container">
      <Header />
      <div className="info-container">
      <h2>Seja bem-vindo, {props.name}</h2> 
        <button className="location-button" onClick={toggleLocation}>
          Localização
        </button>
        {showLocation && locationData && (
          <div className="info-details">
            <div>
              <strong>CEP:</strong> <span>{locationData.cep}</span> <br />
              <strong>Bairro:</strong> <span>{locationData.bairro}</span> <br />
              <strong>Horário:</strong> <span>{props.horario}</span>
            </div>
            <div>
              <strong>Cidade:</strong> <span>{locationData.localidade}</span> <br />
              <strong>Av/Rua:</strong> <span>{props.logradouro}</span> <br />
              <strong>Local:</strong> <span>{props.local}</span>
            </div>
          </div>
        )}
      </div>

      <div className="content-wrapper">
        <div className="participant-list">
          <h2>Participantes Cadastrados</h2>
          {participants.length === 0 ? (
            <p>Nenhum participante cadastrado</p>
          ) : (
            <ul>
              {participants
                .sort((a, b) => a.name.localeCompare(b.name))
                .map((participant, index) => (
                  <li key={index}>
                    <img src={participant.foto} alt="Foto do participante" />
                    <strong>Nome: </strong> {participant.name} <br />
                    <strong>Telefone: </strong> {participant.telefone} <br />
                    <strong>Email: </strong> {participant.email} <br />
                    <strong>Egresso: </strong> {participant.egresso} <br />
                    <strong>Pago: </strong> {participant.pago}
                  </li>
                ))}
            </ul>
          )}
        </div>
        <div className="content">
          <Forms onSubmit={addParticipant} />
        </div>
      </div>
      <div className="footer">
        <Footer />
      </div>
    </div>
  );
};

export default AllInfos;

import React, { useState } from 'react';
import { useFetch } from '../hooks/useFetch';
import Header from './Header';
export function CepCard() {
    const [urlCep, setUrlCep] = useState(null);
    const [dadosCep] = useFetch(urlCep);

    console.log(dadosCep)
    
    function handleSubmit(event) {
        event.preventDefault()
        const formData = new FormData(event.target)
        const cep = formData.get("cep")
        setUrlCep(`https://viacep.com.br/ws/${cep}/json/`)
    }

    return(
        <div style = {{height:"400px", width:"100%"}}>
            <Header/>
            <section>
                <form onSubmit={handleSubmit}>
                    <label>Cep:</label>
                    <input name="cep" type="text" />
                    <button type="submit">Pesquisar</button>
                </form>
                {dadosCep && <p>{dadosCep.cep} - {dadosCep.localidade}</p>}
            </section>

        </div>
    )
}

export default CepCard;
import { useState } from "react";
import { data } from "../mock/data";

function HomePage() {
    const [pessoas, setPessoas] = useState(data)

    function handleSubmit() {
        const objPessoa = {name: "oi"}
        setPessoas([...pessoas, objPessoa])
        data.push(objPessoa);
    }

    return <>
    
        <button onClick={handleSubmit}>Salvar Dados</button>
        {pessoas.map(item => <h1>{item.name}</h1>)}
    </>
}

export default HomePage;
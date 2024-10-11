import React, {useState} from 'react';

function ShowDetails({description}){
    const [enable, setEnable] = useState(false)

    function handleClick(){
        setEnable(!enable)
    }

    return (
        <div>
            {enable && <p>{description}</p>}
            <button onClick={handleClick}>
            { enable ? "Hide" : "Show"}Details</button>
            
        </div>
    )
}

export default ShowDetails;
import { useState } from "react";
import { data } from "../assets/data";
import ButtonNext from "./ButtonNext";
import Header from "./Header";
import Image from "./Image";
import ShowDetails from "./ShowDetails";


const Gallery = () => {
    const [index, setIndex] = useState(0);

    function handleClickIndexNext(){
        if (index +1 !== data.length){
            setIndex(index + 1) 
        }
    }

    function handleClickIndexPrevious(){
        if (index -1 !== data.length){
            setIndex(index - 1) 
        }
    }

    let galleryData = data[index];

    return (
        <div style={{height: "400px", width: "100%"}}>
        <ButtonNext onClickNext={handleClickIndexNext} onClickPrevious={handleClickIndexPrevious}/>
        <Header title={galleryData.name}
        sizeList={data.length} index={index}/>
        <ShowDetails description={galleryData.description}/>
        <Image urlImg={galleryData.url} alt={galleryData.alt}/>
      </div>
    );
    }

   
    export default Gallery;
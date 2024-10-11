import Profile from "./Profile";

const Gallery = ({title}) => {
    //webservice
    const data = [{}]
    return (
        <>
        <h1 style={{margin:"10px"}}>{title}</h1>
        <Profile name="Maria" profession="Physicist"
         awards="Nobel" discovered="polonium" srcImg = "https://i.imgur.com/szV5sdG.jpeg"/>


        <Profile name="Katsuko" profession="geochemist" 
        awards="Miake prize for geochenistry" discovered="a method for mesuring carnon dioxide in seawater" srcImg = "https://i.imgur.com/YfeOqp2.jpeg"/>
        </>
        

       
    );
    }
    export default Gallery;
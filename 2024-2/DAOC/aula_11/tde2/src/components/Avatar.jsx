function Avatar({srcImage, size}){ 
    return(
        <img src={srcImage} style={{borderRadius: "50px"}} 
        width={size} height={size} alt="imagem pessoa"/>
    )
}

export default Avatar;
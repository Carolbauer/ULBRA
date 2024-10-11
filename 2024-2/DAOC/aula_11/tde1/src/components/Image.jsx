function Image({urlImg, alt}){
    return (
        <img style={{paddingTop: "16px"}}src={urlImg} width={140} height={140} alt={alt}/>
    )
}

export default Image;
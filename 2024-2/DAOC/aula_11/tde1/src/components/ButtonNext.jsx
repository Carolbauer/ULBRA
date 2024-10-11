function ButtonNext({ onClickNext, onClickPrevious }) {
    return (
        <div>
            <button type="button" onClick={onClickNext}>Next</button>
             <button type="button" onClick={onClickPrevious}>Previous</button>
        </div>
     
    );
  }
  
  export default ButtonNext;
  
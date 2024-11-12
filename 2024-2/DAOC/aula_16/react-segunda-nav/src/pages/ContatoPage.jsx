import { useNavigate, NavLink, Outlet } from "react-router-dom";
import FormsContact from "../components/Forms/FormsContact";

function ContatoPage({ pessoas, setPessoas }) {
  const navigation = useNavigate();

  return (
    <>
      <h1>ContatoPage</h1>

      <FormsContact pessoas={pessoas} setPessoas={setPessoas} />
      <button onClick={() => navigation("/home")}>Home</button>
      <Outlet />
    </>
  );
}

export default ContatoPage;

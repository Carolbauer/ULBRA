package TDE;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        this.setCliente(cliente);
    }
    @Override
    public void depositar() {

    }

    @Override
    public void transferir() {

    }

    @Override
    public double consultarSaldo() {
        return 0;
    }
}

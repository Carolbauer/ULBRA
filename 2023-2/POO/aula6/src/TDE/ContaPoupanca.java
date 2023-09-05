package TDE;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
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

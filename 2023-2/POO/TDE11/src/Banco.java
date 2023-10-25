import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(final int numeroConta, final double saldo, final String nomeCliente) {
     Conta novaConta = new Conta(numeroConta, saldo, nomeCliente);
        this.contas.add(novaConta);
    }

    public void imprimirContas() {
        for (final Conta conta : this.contas) {
            System.out.println(conta);
        }
    }

    public void atualizarSaldo(final int numeroConta, final double novoSaldo) {
        for (final Conta conta : this.contas) {
            if (conta.getNumeroConta() == numeroConta) {
                conta.setSaldo(novoSaldo);
                break;
            }
        }
    }

    public void deletarConta(final int numeroConta) {
        Conta contaParaRemover = null;
        for (final Conta conta : this.contas) {
            if (conta.getNumeroConta() == numeroConta) {
                contaParaRemover = conta;
                break;
            }
        }
        if (null != contaParaRemover) {
            this.contas.remove(contaParaRemover);
            System.out.println("Conta removida com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}

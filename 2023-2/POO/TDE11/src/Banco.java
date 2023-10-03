import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarConta(int numeroConta, double saldo, String nomeCliente) {
     final Conta novaConta = new Conta(numeroConta, saldo, nomeCliente);
        contas.add(novaConta);
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void atualizarSaldo(int numeroConta, double novoSaldo) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                conta.setSaldo(novoSaldo);
                break;
            }
        }
    }

    public void deletarConta(int numeroConta) {
        Conta contaParaRemover = null;
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                contaParaRemover = conta;
                break;
            }
        }
        if (null != contaParaRemover) {
            contas.remove(contaParaRemover);
            System.out.println("Conta removida com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}

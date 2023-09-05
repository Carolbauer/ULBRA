package TDE;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;

    private final ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public final ArrayList<Conta> getContas() {
        return contas;
    }

    public void setConta(Conta conta) {

        contas.add(conta);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(final int idade) {
        this.idade = idade;
    }
}

package TDE;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;

    private final ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(final String nome, final int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public  ArrayList<Conta> getContas() {
        return this.contas;
    }

    public void setConta(final Conta conta) {

        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

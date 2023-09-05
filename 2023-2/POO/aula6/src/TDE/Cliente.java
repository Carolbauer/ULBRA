package TDE;

public class Cliente {
    private String nome;
    private int idade;

    private Conta conta;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
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

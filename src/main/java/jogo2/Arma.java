package jogo2;

public class Arma implements ItemJogo {
    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }
}

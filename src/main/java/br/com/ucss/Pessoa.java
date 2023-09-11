package br.com.ucss;

public class Pessoa {

    private String nome;
    private int idade;

    public void imprime(){
        System.out.println("Nome da pessoa= "+nome);
        System.out.println("Idade da pessoa= "+idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package br.com.ucss;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Ana Souza");
        pessoa1.setIdade(31);
        pessoa1.imprime();

        pessoa2.setNome("Bia Nunes");
        pessoa2.setIdade(25);
        pessoa2.imprime();

        pessoa3.setNome("Paulo Santos");
        pessoa3.setIdade(25);
        pessoa3.imprime();
    }
}

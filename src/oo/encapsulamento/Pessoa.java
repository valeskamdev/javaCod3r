package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
       setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        idade = Math.abs(idade);
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    @Override
    public String toString() {
        return "Olá, sou "
                + nome
                + " e tenho "
                + idade
                + " anos.";
    }
}

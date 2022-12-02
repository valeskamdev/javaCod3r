package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Oliver", "Queen",130);
        pessoa.setIdade(-38);

        System.out.println(pessoa);
        System.out.println("Nome completo: " + pessoa.getNomeCompleto());
    }
}

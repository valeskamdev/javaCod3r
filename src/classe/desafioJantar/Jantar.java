package classe.desafioJantar;

public class Jantar {
    public static void main(String[] args) {

        Comida comida1, comida2;

        Pessoa pessoa = new Pessoa("João", 45.7);
        comida1 = new Comida("Feijoada", 0.220);
        comida2 = new Comida("Arroz com Pequi", 0.300);

        System.out.println(pessoa.apresentar());  // peso inicial

        pessoa.comer(comida1);

        System.out.println(pessoa.apresentar());  // peso depois da comida1

        pessoa.comer(comida2);

        System.out.println(pessoa.apresentar());  // peso depois da comida2
    }
}

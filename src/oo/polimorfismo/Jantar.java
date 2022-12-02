package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(72.65);

        Arroz arroz = new Arroz(0.200);
        Feijao feijao = new Feijao(0.100);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);

        Sorvete sorvete = new Sorvete(0.400);

        convidado.comer(sorvete);

        System.out.println(convidado.getPeso());
    }
}

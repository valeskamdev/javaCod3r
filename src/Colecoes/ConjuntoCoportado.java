package Colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoCoportado {
    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<String>();  // ordenação total de seus elementos

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(120);
        numeros.add(6);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

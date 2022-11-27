package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome); // acessar pelo indice

        System.out.println(">>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

        for (Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}

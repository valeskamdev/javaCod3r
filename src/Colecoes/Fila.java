package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // offer e add --> adicionam elementos na fila
        // diferenca eh o comportamento quando a fila esta cheia

        fila.add("Ana");  // add -> excecao
        fila.offer("Bia"); // offer -> false
        fila.offer("Carlor");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // peek e element --> obter o proximo elemento da fila (sem remover)
        // diferenca eh o comportamento ocorre quando a fila esta vazia

        System.out.println(fila.peek());  // retorna false
        System.out.println(fila.element());  // retorna excecao

        // fila.size();
        // fila.clear();
        // fila.isEmpty()
        // fila.contains(...)

        // pool --> recupera e remove o início desta fila, null caso estiver vazia

        System.out.println(fila.poll());  // ana
        System.out.println(fila.poll());  // bia
        System.out.println(fila.poll());  // carlos
        System.out.println(fila.poll());  // daniel
        System.out.println(fila.poll());  // rafaela
        System.out.println(fila.poll());  // gui
        System.out.println(fila.poll());  // null
    }
}

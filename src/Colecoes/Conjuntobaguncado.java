package Colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Conjuntobaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // convertendo para Wrapper
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');

        System.out.println(conjunto.remove("teste")); // false
        System.out.println(conjunto.remove("Teste")); // true
        System.out.println(conjunto.remove('x')); // true

        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set numeros = new HashSet();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
        System.out.println(conjunto);

        // conjunto.addAll(numeros);  (uniao entre dois conjuntos)
        conjunto.retainAll(numeros);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}

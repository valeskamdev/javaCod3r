package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Luca", "Gui");

        System.out.println("Usando Frreach:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator:");
        Iterator<String> iterador = aprovados.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("\nUsando Stream:");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}

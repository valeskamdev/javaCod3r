package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // retorna chaves
        System.out.println(usuarios.values()); // retorna os valores
        System.out.println(usuarios.entrySet()); // retorna chave e valor

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4)); // retorna o valor
        System.out.println(usuarios.remove(1));

        // retornando chaves
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        // retornando valores
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " --> ");
            System.out.println(registro.getValue());
        }
    }
}

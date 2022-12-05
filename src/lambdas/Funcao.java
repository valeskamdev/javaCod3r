package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        // encadeando funcoes

        // função que recebe um Integer e retorna uma String
        Function<Integer, String> parOuImparer = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImparer.apply(32));

        Function<String, String> oResultadoE = valor -> "O resultado é " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!";
        Function<String, String> duvida = valor -> valor + "???";

        String resultadoFinal1 = parOuImparer.andThen(oResultadoE).andThen(empolgado).apply(32);
        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImparer.andThen(oResultadoE).andThen(duvida).apply(33);
        System.out.println(resultadoFinal2);
    }
}

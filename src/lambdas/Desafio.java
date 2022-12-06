package lambdas;

import java.util.function.*;

public class Desafio {
    public static void main(String[] args) {

        /*
        1. A partir do produto calcular o preco real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (isento)
        3. Frete: >= 3000 (100)/ < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: $1234,56
        */

        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =  preco -> Double.parseDouble(String.format("%.2f", preco));  // TODO erro NumberFormatException
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
        System.out.println("Preco final: " + preco);
    }
}

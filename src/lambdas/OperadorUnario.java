package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> aoQuadrado = num -> num * num;

        int result = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        int result2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);

        System.out.println(result);  // 16
        System.out.println(result2); // 16
    }
}
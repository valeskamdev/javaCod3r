package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calc = (a, b) -> {
            return a + b;
        };

        System.out.println("SOMA:");
        System.out.println(calc.executar(2, 3));
        System.out.println();

        calc = (a, b) -> a * b;

        System.out.println("MULTIPLICAO:");
        System.out.println(calc.executar(2,3));
    }
}

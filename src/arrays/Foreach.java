package arrays;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = {9.9, 8.7, 7.2, 9.4};

        // percorrendo array usando foreach
        for(double nota : notas) {
            System.out.printf(nota + " ");
        }
    }
}

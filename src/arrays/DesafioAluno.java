package arrays;

import java.util.Scanner;

public class DesafioAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        double[] notas = new double[scanner.nextInt()];

        // dados do array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // somando todas as notas
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }

        double media = somaNotas / notas.length;

        System.out.println("Média: " + media);
        scanner.close();
    }
}

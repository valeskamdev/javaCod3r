package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.print("Quantidade de notas por aluno: ");
        int quantidadeNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {  // percorrendo aluno
            for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {  // percorrendo nota
                System.out.printf("Informe a nota %d do aluno %d: ", (nota + 1), (aluno + 1));
                notasDaTurma[aluno][nota] = scanner.nextDouble();
                total += notasDaTurma[aluno][nota];
            }
        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Mádia: " + media);

        for (double[] notasDoAlunos : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAlunos));
        }

        scanner.close();
    }
}

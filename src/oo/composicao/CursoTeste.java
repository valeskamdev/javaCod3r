package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso2.addAluno(aluno2);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        // retornando alunos do curso3
        for (Aluno aluno : curso3.alunos) {
            System.out.println("Estou matriculado no curso " + "'" + curso3.nome + "'");
            System.out.println("..e meu nome é: " + aluno.nome);
        }

        System.out.println();

        System.out.println("Lista de alunos do primeiro curso: "+ aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.getCursoPorNome("React Native");

        if (cursoEncontrado != null) {
            System.out.println("Curso encontrado: " + cursoEncontrado.nome);
            System.out.println("Alunos deste curso: " +cursoEncontrado.alunos);
        }
    }
}

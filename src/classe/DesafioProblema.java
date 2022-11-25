package classe;

/* acessando valor primitivo fora do metedo main fazendo uma instancia
   ou podeeria colocar static no atributo sem precisar instanciar */
public class DesafioProblema {

    int a = 3;
    static int b = 4;

    public static void main(String[] args) {

        DesafioProblema d = new DesafioProblema();

        System.out.println(d.a); // acessando atraves da instancia
        System.out.println(b); // acessando diretamente
    }
}

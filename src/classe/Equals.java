package classe;

public class Equals {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.nome = "Pedro Silva";
        usuario1.email = "pedrosilva@gmail.com";

        usuario2.nome = "Pedro Silva";
        usuario2.email = "pedrosilva@gmail.com";

        System.out.println(usuario1 == usuario2);
        System.out.println(usuario1.equals(usuario2));
        System.out.println(usuario2.equals(usuario1));
    }
}

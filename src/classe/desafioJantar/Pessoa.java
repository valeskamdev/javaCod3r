package classe.desafioJantar;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            peso += comida.peso;
        }
    }

    public String apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kg";
    }
}

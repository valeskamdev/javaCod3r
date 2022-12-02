package oo.heranca.desafio;

public class Supra extends Carro{

    public Supra() {
        this(315);
    }

    public Supra(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 20;
    }
}

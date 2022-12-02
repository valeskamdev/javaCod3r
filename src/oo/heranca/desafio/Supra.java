package oo.heranca.desafio;

public class Supra extends Carro{

    Supra() {
        this(315);
    }

    Supra(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 20;
    }
}

package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidade = 10;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {

        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
         velocidade += delta;
        }
    }

    public void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        }
    }

    @Override
    public String toString() {
        return " velocidade atual: " + velocidade + "Km/h.";
    }
}

package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidade = 10;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {

        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
         velocidade += delta;
        }
    }

    void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        }
    }

    @Override
    public String toString() {
        return " velocidade atual: " + velocidade + "Km/h.";
    }
}

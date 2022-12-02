package oo.heranca.desafio;

public class Carro {

    int velocidade = 10;

    void acelerar() {
         velocidade += 5;
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

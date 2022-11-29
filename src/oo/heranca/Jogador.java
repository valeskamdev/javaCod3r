package oo.heranca;

public class Jogador {

    int posicaoX;
    int posicaoY;

    void andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> posicaoY--;
            case LESTE -> posicaoX++;
            case SUL -> posicaoY++;
            case OESTE -> posicaoX--;
        }
    }
}

package oo.heranca;

public class Jogador {

    int vida = 100;
    int posicaoX;
    int posicaoY;

    public Jogador(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(posicaoX - oponente.posicaoX);
        int deltaY = Math.abs(posicaoY - oponente.posicaoY);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    void andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> posicaoY--;
            case LESTE -> posicaoX++;
            case SUL -> posicaoY++;
            case OESTE -> posicaoX--;
        }
    }
}

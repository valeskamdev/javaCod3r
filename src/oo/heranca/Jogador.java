package oo.heranca;

public class Jogador {

    public int vida = 100;
    public int posicaoX;
    public int posicaoY;

    protected Jogador(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public boolean atacar(Jogador oponente) {

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

    public void andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> posicaoY--;
            case LESTE -> posicaoX++;
            case SUL -> posicaoY++;
            case OESTE -> posicaoX--;
        }
    }
}

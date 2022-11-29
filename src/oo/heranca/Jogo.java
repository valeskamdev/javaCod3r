package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();

        jogador1.posicaoX = 10;
        jogador1.posicaoY = 10;

        jogador1.andar(Direcao.NORTE);  // movendo y
        jogador1.andar(Direcao.LESTE);  // movendo x
        jogador1.andar(Direcao.NORTE);
        jogador1.andar(Direcao.LESTE);

        System.out.println(jogador1.posicaoX);
        System.out.println(jogador1.posicaoY);
    }
}
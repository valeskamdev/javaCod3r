package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        Heroi heroi = new Heroi(10, 11);

        monstro.posicaoX = 10;
        monstro.posicaoY = 10;

        System.out.println("Monstro => " + monstro.vida);
        System.out.println("Heroi => " + heroi.vida);
        System.out.println();

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro => " + monstro.vida);
        System.out.println("Heroi => " + heroi.vida);
    }
}
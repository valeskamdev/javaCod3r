package oo.abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String mover() {
        return "Mover => usando as patas";
    }

    @Override
    public String mamar() {
        return "Mamar => usando leite";
    }
}

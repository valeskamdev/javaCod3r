package oo.heranca.desafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();

    // implementacao padrao usando default
    default int velocidadeDoAr() {
        return 1;
    }
}

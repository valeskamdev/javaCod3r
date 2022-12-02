package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Supra supra = new Supra();
        Golf golf = new Golf();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);

        supra.acelerar();
        supra.acelerar();
        golf.acelerar();

        golf.frear();
        golf.frear();

        golf.acelerar();
        golf.acelerar();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);
    }
}

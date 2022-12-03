package oo.heranca.teste;

import oo.heranca.desafio.Golf;
import oo.heranca.desafio.Supra;

public class CarroTeste {
    public static void main(String[] args) {

        Golf golf = new Golf();
        Supra supra = new Supra();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);
        System.out.println();

        supra.acelerar();
        golf.acelerar();
        golf.acelerar();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);
        System.out.println();

        supra.ligarTurbo();
        supra.desligarAr();
        supra.acelerar();
        golf.acelerar();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);
        System.out.println();

        supra.desligarTurbo();
        supra.acelerar();
        golf.acelerar();
        golf.acelerar();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);
        System.out.println();

        supra.ligarTurbo();
        supra.ligarAr();
        supra.acelerar();
        golf.acelerar();

        System.out.println("Supra => " + supra);
        System.out.println("Golf => " + golf);
    }
}

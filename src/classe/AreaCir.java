package classe;

public class AreaCir {

    double raio;
    static final double PI = 3.1415;

    AreaCir(double raioInicial) {
        raio = raioInicial;
    }

    double area() { // método que pertence a instancia
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {  // método que pertence a classe
        return PI * Math.pow(raio, 2);
    }
}

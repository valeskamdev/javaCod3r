package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
        dia = 2;
        mes = 5;
        ano = 2003;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}

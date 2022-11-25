package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
//      dia = 2;
//      mes = 5;
//      ano = 2003;
        this(2, 5, 2003);  // this como método, chamando outro construtor (USADO SOMENTE NO CONSTRUTOR)
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", this.dia, mes, ano);
    }
}

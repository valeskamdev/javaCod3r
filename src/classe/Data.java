package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
//      dia = 2;
//      mes = 5;
//      ano = 2003;
        this(2, 5, 2003);  // this como método, chamando construtor abaixo (USADO SOMENTE NO CONSTRUTOR)
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        final String formato = "%d/%d/%d";  // variavel local, criada dentro do escopo do método (SEMPRE INICIALIZADA)
        return String.format(formato, this.dia, mes, ano);
    }
}

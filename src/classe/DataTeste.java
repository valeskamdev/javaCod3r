package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1, d2;
        d1 = new Data();
        d2 = new Data();

        d1.dia = 2;
        d1.mes = 5;
        d1.ano = 2003;

        d2.dia = 15;
        d2.mes = 4;
        d2.ano = 2003;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}

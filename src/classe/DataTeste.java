package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1, d2;
        d1 = new Data();
        d2 = new Data(15, 4, 2003);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}

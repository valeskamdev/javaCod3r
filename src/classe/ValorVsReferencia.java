package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;  // atribuicao por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;  // atribuicao por referencia (objeto)

        // compartilhando informacoes, pois sao atribuidos por referencia
        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d2.obterDataFormatada());
        System.out.println(d1.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d2.obterDataFormatada());
        System.out.println(d1.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);  // return 5
    }

    // usando o membro static para ser acessado em uma classe static (main)
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;  // nao altera o valor primitvo
    }
}

package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 9.67, 100);
        compra1.addItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.addItem("Caderno", 10, 10);
        compra2.addItem(new Produto("Impressora", 998.90), 1);

        Cliente cliente = new Cliente("Maria Joaquina");
        cliente.addCompra(compra1);
        cliente.addCompra(compra2);

        System.out.println(cliente.getValorTotal());
    }
}

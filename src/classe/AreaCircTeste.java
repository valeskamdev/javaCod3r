package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCir area1, area2;
        area1 = new AreaCir(10.1);
        area2 = new AreaCir(5.3);

        area1.raio = 150;

        System.out.println(AreaCir.area(100));
        System.out.println(area2.area());
        System.out.println(AreaCir.PI);
    }
}

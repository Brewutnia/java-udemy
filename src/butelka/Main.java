package butelka;

public class Main {
    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[50];

        for (int i = 1; i < butelka.length; i++) {
            butelka[i] = new Butelka(i);
        }
        butelka[1].wlej(20);
        butelka[10].wlej(5);
        butelka[1].przelej(10,butelka[10]);
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[10].getIleLitrow());
    }
}
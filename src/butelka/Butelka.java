package butelka;

public class Butelka {
    private double ileLitrow;
    private double pojemnosc = 60;


    Butelka(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow() {
        return ileLitrow;
    }

    boolean wlej(double ilosc) {
        if ((ilosc + ileLitrow) <= this.pojemnosc)
            this.ileLitrow += ilosc;
        else
            return false;

        return true;

    }

    boolean wylej(double ilosc) {
        if (ilosc <= ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;

        return true;
    }

    void przelej(double ilosc, Butelka gdziePrzelac) {
        if (this.wylej(ilosc) && (gdziePrzelac.ileLitrow + ilosc) <= pojemnosc) {
            gdziePrzelac.wlej(ilosc);
        } else
            System.out.println("Za mało wody");
    }
}



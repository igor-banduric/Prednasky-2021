package sk.euba.fhi.tajj.prednaska;

import static java.lang.Math.log;

public class Rampa {
    private Lopticka lopticka;

    public Rampa(Lopticka lopticka) {
        this.lopticka = lopticka;
    }

    public int pocetOdrazov(float vyska) {
        int pocetOdrazov = (int) (log(1.0 / vyska) / log(this.lopticka.getKoeficient()));
         return pocetOdrazov;
    }
}

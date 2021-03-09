package sk.euba.fhi.tajj.prednaska;

import static java.lang.Math.log;

public class Rampa {
    private Lopticka lopticka;

    public Rampa(Lopticka lopticka) {
        this.lopticka = lopticka;
    }

    public void zhodLopticku(float vyska) {
        int pocetOdrazov = pocetOdrazov(vyska);
        System.out.println("Pocet Odrazov: " + pocetOdrazov);

        vypisOdrazy(vyska);
    }

    private void vypisOdrazy(float vyska) {
        // vypocet a zobrazovanie hodnot jednotl. vyskokov do "tabulky"
        for (int x = 0; x <= 10; x++) {
            System.out.print(x + ": ");
            if (vyska < 1) {
                System.out.println((vyska * 100) + " cm");
            } else {
                System.out.println(vyska + " m");
            }
            vyska *= this.lopticka.getKoeficient();
        }

    }

    public int pocetOdrazov(float vyska) {
        int pocetOdrazov = (int) (log(1.0 / vyska) / log(this.lopticka.getKoeficient()));
        /*
        int i;
        float v2 = vyska;
        for (i = 0; v2 > 1; i++) {
            v2 *= this.lopticka.getK();
        }
        System.out.println(i - 1);
        */
        return pocetOdrazov;
    }
}

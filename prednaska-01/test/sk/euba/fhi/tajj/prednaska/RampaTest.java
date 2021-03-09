package sk.euba.fhi.tajj.prednaska;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RampaTest {

    @Test
    public void otestujPocetOdrazov() {
        Lopticka lopticka = new Lopticka(0.83F);
        Rampa rampa = new Rampa(lopticka);

        int pocetOdrazov = rampa.pocetOdrazov(2);
        int ocakavanyPocetOdrazov = 3;

        Assertions.assertEquals(ocakavanyPocetOdrazov, pocetOdrazov);
    }

    @Test
    public void otestujPocetOdrazov2() {
        Lopticka lopticka = new Lopticka(0.86F);
        Rampa rampa = new Rampa(lopticka);

        int pocetOdrazov = rampa.pocetOdrazov(2);
        int ocakavanyPocetOdrazov = 4;

        Assertions.assertEquals(ocakavanyPocetOdrazov, pocetOdrazov);
    }
}

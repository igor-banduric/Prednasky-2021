package sk.euba.fhi.tajj.prednaska;

import java.util.Scanner;

import static java.lang.Math.log;

public class Program {

    public void vypisUlohy() {
        float vyska = nacitajVstup();
        float koeficient = nacitajVstup();

        Lopticka lopticka = new Lopticka(koeficient);
        Rampa rampa = new Rampa(lopticka);

        rampa.zhodLopticku(vyska);

        // alternativny vypocet poctu vyskokov lopticky vacsich ako 1 m pomocou cyklu
    }

    private float nacitajVstup() {
        float vstup;
        Scanner in = new Scanner(System.in);
        vstup = in.nextFloat();
        return vstup;
    }

}

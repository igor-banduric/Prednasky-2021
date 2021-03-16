package sk.euba.fhi.tajj.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DemoException {

    public static void main(String[] args) {
        new DemoException().hlavna();
    }

    public void hlavna() {

        try {
            foo(new ArrayList());
            System.out.println("som za volanim foo()");
        } catch (Exception exception) {
            // napriklad: ignouruje chybu
            System.out.println("som v catch bloku");
        } finally {
            System.out.println("toto vykona vzdy");
        }
        System.out.println("koniec metody hlavna()");

     }

    /**
     * @param mojList
     * @return
     * @throws MojaVynimka - v pripade chyby
     */
    public List foo(List mojList) {
        List upravenyList = null;

        if (mojList.isEmpty()) {
            throw new MojaVynimka("List je prazdny a nema byt prazdny");
        } else {
            //kod co pracuje s mojList
            upravenyList = new ArrayList();
        }

        return upravenyList ;
    }

}

package sk.euba.fhi.tajj.prednaska;

public class TriedaNaDedenie {
    private boolean prepinac = true;

    public TriedaNaDedenie(boolean prepinac) {
        this.prepinac = prepinac;
    }

    protected boolean vratHodnotuPrepinaca() {
        return this.prepinac;
    }

    protected void metoda(final String parameter) {
    }

    protected String meno;

    protected String dajMeno() {
        return "meno";
    }
}

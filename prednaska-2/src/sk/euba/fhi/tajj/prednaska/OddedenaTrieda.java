package sk.euba.fhi.tajj.prednaska;

public class OddedenaTrieda extends TriedaNaDedenie{

    public OddedenaTrieda(boolean prepinac) {
        super(prepinac);
    }

    public boolean metoda() {
        return this.vratHodnotuPrepinaca();
    }
}

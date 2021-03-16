package sk.euba.fhi.tajj.exceptions;

public class MojaVynimka extends RuntimeException{

    public MojaVynimka(String message) {
        super(message);
    }

    public MojaVynimka(Exception exception) {

    }
}

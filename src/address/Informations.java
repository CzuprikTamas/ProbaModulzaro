package address;

import java.util.ArrayList;
import java.util.List;

public class Informations {
    private String orszag;
    private int iranyitoszam;
    private String utca;
    private int emelet;

    public Informations(String orszag, int iranyitoszam, String utca, int emelet) {
        this.orszag = orszag;
        this.iranyitoszam = iranyitoszam;
        this.utca = utca;
        this.emelet = emelet;
    }

    public String getOrszag() {
        return orszag;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getEmelet() {
        return emelet;
    }

    public void setEmelet(int emelet) {
        this.emelet = emelet;
    }

    @Override
    public String toString() {
        return "Informations[" +
                "orszag = " + orszag +
                ", iranyitoszam = " + iranyitoszam +
                ", utca = " + utca +
                ", emelet = " + emelet +
                ']';
    }
}

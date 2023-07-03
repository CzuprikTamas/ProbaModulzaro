import address.Employe;
import address.Informations;
import animal.Animals;
import text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Animals foka = new Animals("Feca");
        foka.addBecenevek("asd");
        foka.addBecenevek("Felszemu");
        foka.addBecenevek("tuzes");
        for (String becenev : foka.becenevek) {
            System.out.println(becenev);
        }


        Employe SzurosszemuEdvard = new Employe();

        Informations infok = new Informations("Hungary",
                4032, "Kiskunyhosfele", 3);
        SzurosszemuEdvard.addAdresses(infok);

    }
}
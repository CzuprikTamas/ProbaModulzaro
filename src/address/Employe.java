package address;

import java.util.ArrayList;
import java.util.List;

public class Employe {

    public List<Informations> adresses;

    public Employe() {
        adresses = new ArrayList<>();
    }

    public void addAdresses(Informations info) {
        adresses.add(info);
    }
}

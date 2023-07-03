package animal;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    public final String name;
    public List<String> becenevek;

    public void addBecenevek(String becenev) {
        becenevek.add(becenev);
    }

    public Animals(String name) {
        this.name = name;
        becenevek = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getBecenevek() {
        return becenevek;
    }

    public void setBecenevek(List<String> becenevek) {
        this.becenevek = becenevek;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name : " + name +
                ", becenevek = " + becenevek +
                '}';
    }
}

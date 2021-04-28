//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Population;

import Country.Settlement;
import Location.Point;
import Simulation.Clock;

public class Healthy extends Person {
    public Healthy() {
    }

    public Healthy(int age, Point location, Settlement settlement) {
        super(age, location, settlement);
    }

    public double contagionProbability() {
        return 1.0D;
    }

    public Person vaccinate() {
        Vaccinated v1 = new Vaccinated(this.getAge(), this.getLocation(), this.getSettlement(), Clock.now());
        return v1;
    }

    public String toString() {
        return "Healthy{} " + super.toString();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

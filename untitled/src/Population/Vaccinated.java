//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Population;

import Country.City;
import Country.Settlement;
import Location.Point;
import Simulation.Clock;

public class Vaccinated extends Person {
    private long vaccinationTime;

    public Vaccinated() {
        this(0, new Point(), new City(), 0L);
    }

    public Vaccinated(int age, Point location, Settlement settlement, long vaccinationTime) {
        super(age, location, settlement);
        this.vaccinationTime = vaccinationTime;
    }

    public long getvaccinationTime() {
        return this.vaccinationTime;
    }

    public double contagionProbability() {
        long t = Clock.now() - this.getvaccinationTime();
        return t < 21L ? Math.min(1.0D, 0.56D + 0.15D * Math.sqrt((double)(21L - t))) : Math.max(0.05D, 1.05D / (double)(t - 14L));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Vaccinated that = (Vaccinated)o;
            return this.vaccinationTime == that.vaccinationTime;
        } else {
            return false;
        }
    }

    public String toString() {
        long var10000 = this.vaccinationTime;
        return "Vaccinated{vaccinationTime=" + var10000 + "} " + super.toString();
    }
}

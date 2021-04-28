//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Population;

import Country.City;
import Country.Settlement;
import Location.Point;
import Virus.ChineseVariant;
import Virus.IVirus;
import java.util.Objects;

public class Convalescent extends Person {
    private IVirus virus;

    public Convalescent() {
        this(0, new Point(), new City(), new ChineseVariant());
    }

    public Convalescent(int age, Point location, Settlement settlement, IVirus virus) {
        super(age, location, settlement);
        this.virus = virus;
    }

    public double contagionProbability() {
        return 0.2D;
    }

    public String toString() {
        return "Convalescent{virus=" + this.virus + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Convalescent that = (Convalescent)o;
            return Objects.equals(this.virus, that.virus);
        } else {
            return false;
        }
    }
}

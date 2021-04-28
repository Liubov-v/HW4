//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Country;

import Location.Location;

public class City extends Settlement {
    public City() {
    }

    public City(String name, Location location) {
        super(name, location);
    }

    public RamzorColor calculateRamzorGrade() {
        double color = 0.2D * Math.pow(4.0D, 1.25D * this.contagiousPercent());
        if (color < RamzorColor.GREEN.getFactor()) {
            return this.setRamzorColor(RamzorColor.GREEN);
        } else if (color < RamzorColor.YELLOW.getFactor()) {
            return this.setRamzorColor(RamzorColor.YELLOW);
        } else {
            return color < RamzorColor.ORANGE.getFactor() ? this.setRamzorColor(RamzorColor.ORANGE) : this.setRamzorColor(RamzorColor.RED);
        }
    }

    public String toString() {
        return "City{} " + super.toString();
    }
}

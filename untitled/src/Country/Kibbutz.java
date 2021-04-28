//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Country;

import Location.Location;

public class Kibbutz extends Settlement {
    public Kibbutz() {
    }

    public Kibbutz(String name, Location location) {
        super(name, location);
    }

    public RamzorColor calculateRamzorGrade() {
        double color = 0.45D + Math.pow(Math.pow(1.5D, this.getRamzorColor().getFactor()) * (this.contagiousPercent() - 0.4D), 3.0D);
        if (color < RamzorColor.GREEN.getFactor()) {
            return this.setRamzorColor(RamzorColor.GREEN);
        } else if (color < RamzorColor.YELLOW.getFactor()) {
            return this.setRamzorColor(RamzorColor.YELLOW);
        } else {
            return color < RamzorColor.ORANGE.getFactor() ? this.setRamzorColor(RamzorColor.ORANGE) : this.setRamzorColor(RamzorColor.RED);
        }
    }

    public String toString() {
        return "Kibbutz{} " + super.toString();
    }
}

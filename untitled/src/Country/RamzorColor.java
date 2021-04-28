//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Country;

public enum RamzorColor {
    GREEN(0.4D),
    YELLOW(0.6D),
    ORANGE(0.8D),
    RED(1.0D);

    private double factor;

    public double getFactor() {
        return this.factor;
    }

    private RamzorColor(double action) {
        this.factor = action;
    }

    public String toString() {
        double var10000 = this.factor;
        return "RamzorColor{factor=" + var10000 + "} " + super.toString();
    }
}

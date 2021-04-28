//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;
import java.util.Objects;

public class Sick extends Person {
    private long contagiousTime;
    private IVirus virus;

    public String toString() {
        long var10000 = this.contagiousTime;
        return "Sick{contagiousTime=" + var10000 + ", virus=" + this.virus + "} " + super.toString();
    }

    public Sick() {
        this.contagiousTime = 0L;
        this.virus = null;
    }

    public Sick(int age, Point location, Settlement settlement, long contagiousTime, IVirus virus) {
        super(age, location, settlement);
        this.contagiousTime = contagiousTime;
        this.virus = virus;
    }

    public Sick(Sick s) {
        this.contagiousTime = s.contagiousTime;
        this.virus = s.virus;
    }

    public double contagionProbability() {
        return 1.0D;
    }

    public Sick contagion(IVirus x) throws Exception {
        throw new Exception("Person cant be sick twice");
    }

    public long getContagiousTime() {
        return this.contagiousTime;
    }

    public Person recover() {
        Convalescent c1 = new Convalescent(this.getAge(), this.getLocation(), this.getSettlement(), this.virus);
        return c1;
    }

    public boolean tryToDie() {
        return this.virus.tryToKill(this);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Sick sick = (Sick)o;
            return this.contagiousTime == sick.contagiousTime && Objects.equals(this.virus, sick.virus);
        } else {
            return false;
        }
    }

    public IVirus getVirus() {
        return this.virus;
    }

    public boolean ifSick() {
        return true;
    }
}

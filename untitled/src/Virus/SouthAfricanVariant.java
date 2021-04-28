//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Virus;

import Population.Person;
import Population.Sick;
import Simulation.Clock;

public class SouthAfricanVariant implements IVirus {
    private static double p_d_18 = 0.05D;
    private static double p_d_18_55 = 0.08D;
    private static double p_d_55 = 0.08D;
    private static double p_c_18 = 0.6D;
    private static double p_c_18_55 = 0.5D;
    private static double p_c_55 = 0.5D;

    public SouthAfricanVariant() {
    }

    public double contagionProbability(Person p) {
        double vpc_by_age;
        if (p.getAge() <= 18) {
            vpc_by_age = p_c_18;
        } else if (p.getAge() > 18 && p.getAge() <= 55) {
            vpc_by_age = p_c_18_55;
        } else {
            vpc_by_age = p_c_55;
        }

        return vpc_by_age * p.contagionProbability();
    }

    public boolean tryToContagion(Person p, Person p_unknown) {
        if (p_unknown instanceof Sick) {
            return false;
        } else {
            double distance = Math.sqrt(Math.pow((double)(p.getLocation().getY() - p_unknown.getLocation().getY()), 2.0D) * Math.pow((double)(p.getLocation().getX() - p_unknown.getLocation().getX()), 2.0D));
            double p_total = Math.min(1.0D, 0.14D * Math.exp(2.0D - 0.25D * distance)) * this.contagionProbability(p_unknown);
            return p_total <= Math.random();
        }
    }

    public boolean tryToKill(Sick p) {
        double vpd_by_age;
        if (p.getAge() <= 18) {
            vpd_by_age = p_d_18;
        } else if (p.getAge() > 18 && p.getAge() <= 55) {
            vpd_by_age = p_d_18_55;
        } else {
            vpd_by_age = p_d_55;
        }

        long t = p.getContagiousTime() - Clock.now();
        double p_total = Math.max(0.0D, vpd_by_age - 0.01D * vpd_by_age * Math.pow((double)(t - 15L), 2.0D));
        return p_total <= Math.random();
    }

    public String toString() {
        return "SouthAfricanVariant{p_d_18=" + p_d_18 + ", p_d_18_55=" + p_d_18_55 + ", p_d_55=" + p_d_55 + ", p_c_18=" + p_c_18 + ", p_c_18_55=" + p_c_18_55 + ", p_c_55=" + p_c_55 + "}";
    }
}

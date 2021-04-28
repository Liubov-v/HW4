//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Population;

import Country.City;
import Country.Settlement;
import Location.Point;
import Simulation.Clock;
import Virus.IVirus;

public abstract class Person {
    private int age;
    private Point location;
    private Settlement settlement;

    public Person() {
        this(0, new Point(), new City());
    }

    public Person(int age, Point location, Settlement settlement) {
        this.age = age;
        this.location = location;
        this.settlement = settlement;
    }

    public abstract double contagionProbability();

    public Sick contagion(IVirus x) throws Exception {
        Sick s1 = new Sick(this.age, this.location, this.settlement, Clock.now(), x);
        return s1;
    }

    public boolean ifSick() {
        return false;
    }

    public int getAge() {
        return this.age;
    }

    public Point getLocation() {
        return this.location;
    }

    public Settlement getSettlement() {
        return this.settlement;
    }

    public String toString() {
        return "Person{age=" + this.age + ", location=" + this.location + ", settlement=" + this.settlement + "}";
    }

    public Person(Person p) {
        this.age = p.age;
        this.location = p.location;
        this.settlement = p.settlement;
    }
}

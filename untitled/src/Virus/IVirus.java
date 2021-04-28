//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Virus;

import Population.Person;
import Population.Sick;

public interface IVirus {
    double contagionProbability(Person var1);

    boolean tryToContagion(Person var1, Person var2);

    boolean tryToKill(Sick var1);
}

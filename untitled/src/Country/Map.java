//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Country;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<Settlement> settlements = new ArrayList();

    public Map() {
    }

    public boolean addSettelmentToMap(Settlement s) {
        return this.settlements.add(s);
    }

    public boolean removeSettelmentToMap(Settlement s) {
        return this.settlements.remove(s);
    }

    public Settlement getSettelmentFromMapByIndex(int i) {
        return (Settlement)this.settlements.get(i);
    }

    public int getSettlementAmount() {
        return this.settlements.size();
    }

    public String toString() {
        return "Map{settlements=" + this.settlements + "}";
    }
}

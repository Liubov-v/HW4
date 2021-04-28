//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Simulation;

public final class Clock {
    private static long time;

    private Clock() {
        time = 0L;
    }

    public static long now() {
        return time;
    }

    public static void nextTick() {
        ++time;
    }

    public String toString() {
        return "Clock{time=" + time + "}";
    }
}

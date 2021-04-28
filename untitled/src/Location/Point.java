//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Location;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Object other) {
        boolean ans = false;
        if (other instanceof Point) {
            ans = this.x == ((Point)other).x && this.y == ((Point)other).y;
        }

        return ans;
    }

    public String toString() {
        return "The Point(" + this.x + "," + this.y + ")";
    }
}

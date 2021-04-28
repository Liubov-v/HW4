//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Location;

public class Location {
    private Point position;
    private Size size;

    public Location() {
        this.position = new Point();
        this.size = new Size();
    }

    public Location(Point position, Size size) {
        this.position = new Point(position);
        this.size = new Size(size);
    }

    public Location(Location l) {
        this.position = l.position;
        this.size = l.size;
    }

    public boolean equals(Object other) {
        boolean ans = false;
        if (other instanceof Size) {
            ans = this.position == ((Location)other).position && this.size == ((Location)other).size;
        }

        return ans;
    }

    public String toString() {
        return " The Location:\n\tposition=" + this.position + "\n\tsize=" + this.size;
    }

    public Point getPoint() {
        return this.position;
    }

    public Size getSize() {
        return this.size;
    }
}

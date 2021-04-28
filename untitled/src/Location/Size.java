//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Location;

public class Size {
    private int width;
    private int height;

    public Size() {
        this.width = 0;
        this.height = 0;
    }

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Size(Size s) {
        this.width = s.width;
        this.height = s.height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        boolean ans = false;
        if (other instanceof Size) {
            ans = this.width == ((Size)other).width && this.height == ((Size)other).height;
        }

        return ans;
    }

    public String toString() {
        return " The Size:\n\twidth=" + this.width + "\n\theight=" + this.height;
    }
}

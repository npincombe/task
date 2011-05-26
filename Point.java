import java.awt.*;

public class Point implements Geometry {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        // draw a line to represent the point
        g.drawLine(getX(), getY(),getX(), getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

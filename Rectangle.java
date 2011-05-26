import java.awt.*;

public class Rectangle implements Geometry {
    private int x, y, width, height;

    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}

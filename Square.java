import java.awt.*;

public class Square implements Geometry {
    private int x, y, height;

    public void draw(Graphics g) {
        g.drawRect(x, y, height, height);
    }
}

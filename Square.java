import java.awt.*;

public class Square extends Rectangle {

    public Square(int x, int y, int height) {
        super(x, y, height, height);
    }

    public void draw(Graphics g) {
        g.drawRect(getX(), getY(), getHeight(), getHeight());
    }
}

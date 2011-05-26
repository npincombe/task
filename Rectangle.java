import java.awt.*;

public class Rectangle extends Point {
    protected int width;
    protected int height;

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw(Graphics g) {
        g.drawRect(getX(), getY(), getWidth(), getHeight());
    }
}

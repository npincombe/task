import java.awt.*;

public class Ellipse extends Point {
    protected int height;
    protected int width;

    public Ellipse(int x, int y, int height, int width){
        super(x,y);
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), getWidth(), getHeight());
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

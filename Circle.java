import java.awt.*;

public class Circle extends Ellipse {
    public Circle(int x, int y, int radius){
        super(x,y,radius * 2, radius * 2);
    }

    public int getRadius(){
        return getHeight() / 2;
    }

    public int getDiameter(){
        return getHeight();
    }
}

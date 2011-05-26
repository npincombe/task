import sun.tools.tree.NewArrayExpression;

import javax.swing.*;
import java.awt.*;

public class SeparateMonitorDevice extends Device{
    public void drawGeometry(Geometry g){
        GeometryCollection<Geometry> collection = new GeometryCollection<Geometry>(){};
        collection.add(g);
        drawGeometryCollection(collection);
    }

    public void drawGeometryCollection(final GeometryCollection<? extends Geometry> collection) {
        JFrame frame = new JFrame();
        frame = new JFrame();
        frame.setBounds(100, 20, 500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new JComponent() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Geometry geometry : collection) {
                    geometry.draw(g);
                }
            }
        });

        frame.setVisible(true);
    }
}

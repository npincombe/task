import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MonitorDevice extends Device {
    protected List<Geometry> geometryList = new ArrayList<Geometry>();
    protected JComponent jComponent;
    protected JFrame frame;

    private class MonitorComponent extends JComponent {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Geometry geometry : geometryList) {
                geometry.draw(g);
            }
        }
    }

    public void drawGeometry(Geometry geometry) {
        geometryList.add(geometry);
        getJComponent().repaint();
    }

    public void drawGeometryCollection(final GeometryCollection<? extends Geometry> collection) {
        geometryList.addAll(collection);
        getJComponent().repaint();
    }

    public JFrame getFrame() {
        return frame;
    }

    public MonitorDevice() {
        frame = new JFrame();
        frame.setBounds(100, 20, 500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jComponent = new MonitorComponent();
        frame.getContentPane().add(jComponent);
        frame.setVisible(true);
    }

    public void setJComponent(JComponent jComponent) {
        this.jComponent = jComponent;
    }

    public JComponent getJComponent() {
        return jComponent;
    }
}

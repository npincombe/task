import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class MonitorDevice extends Device {
    private class MonitorComponent extends JComponent {
        public MonitorComponent() {
            setPreferredSize(new Dimension(500, 500));
            setBackground(Color.black);
        }
    }

//  public MonitorDevice(){
//    setJComponent(new MonitorComponent());
//  }

    private JComponent jComponent;

    public JComponent getJComponent() {
        return jComponent;
    }

    public MonitorDevice() {
        JFrame frame = new JFrame();
        frame.setLocation(100, 20);
        frame.setSize(500, 500);

        jComponent = new MonitorComponent();
        frame.getContentPane().add(getJComponent(), BorderLayout.CENTER);
//    frame.repaint();
        jComponent.setVisible(true);
        frame.pack();
        frame.setVisible(true);
    }
}

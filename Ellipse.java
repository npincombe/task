public class Ellipse implements Geometry {
    private int x, y, height, width;

    public void addToDevice(Device device) {
        device.getJComponent().getGraphics().drawOval(x, y, height, width);
    }
}

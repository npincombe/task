public class Point implements Geometry {
    private int x, y;

    public void addToDevice(Device device) {
        device.getJComponent().getGraphics().drawOval(x, y, 1, 1);
    }
}

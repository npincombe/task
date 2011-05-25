public class Rectangle implements Geometry {
    private int x, y, width, height;

    public void addToDevice(Device device) {
        device.getJComponent().getGraphics().drawRect(x, y, width, height);
    }
}

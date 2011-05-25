public class Square implements Geometry {
    private int x, y, height;

    public void addToDevice(Device device) {
        device.getJComponent().getGraphics().drawRect(x, y, height, height);
    }
}

public class Circle implements Geometry{
  private int x, y;
  private int radius;
  public void addToDevice(Device device){
    device.getJComponent().getGraphics().drawOval(x, y, radius*2, radius*2);
  }
}

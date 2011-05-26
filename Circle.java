public class Circle implements Geometry {
    private int x = 10, y = 10;
    private int radius = 10;

    public void addToDevice(Device device) {
/*    if(device.getJComponent().getGraphics() == null){
      System.out.println("null");
return;
    }
*/
        device.getJComponent().getGraphics().fillOval(x, y, radius * 2, radius * 2);
    }
}

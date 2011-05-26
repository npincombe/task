public class Test{
  public static void main(String [] args){
    CircleCollection cc = new CircleCollection();
    cc.add(new Circle(10,10,50));
    cc.drawToDevice(new MonitorDevice());
  }
}

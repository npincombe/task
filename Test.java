public class Test{
  public static void main(String [] args){
    CircleCollection cc = new CircleCollection();
    cc.add(new Circle());
    //cc.drawToDevice(new MonitorDevice());    
//MonitorDevice md = new MonitorDevice();
//if(md.getJComponent().getGraphics() == null)
//System.out.println(">.<");
   cc.drawToDevice(new MonitorDevice());    
  }
}

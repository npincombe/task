import javax.swing.JComponent;

public abstract class Device{
  private JComponent jComponent;

  public void setJComponent(JComponent jComponent){
    this.jComponent = jComponent;
  }

  public JComponent getJComponent(){
    return jComponent;
  }

  public abstract void draw();
  
  public void addGeometry(Geometry geometry){
    geometry.addToDevice(this);
  }
}


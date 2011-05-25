import javax.swing.JComponent;
import java.awt.Color;

public abstract class Device{
/*  private JComponent jComponent;

  public void setJComponent(JComponent jComponent){
    this.jComponent = jComponent;
  }
*/

  public  abstract JComponent getJComponent();
/*{
    return jComponent;
  }
*/

//  public abstract void draw();
  
  public void drawGeometry(Geometry geometry){

    getJComponent().getGraphics().setColor(Color.red);

    geometry.addToDevice(this);
  }

//{
//    geometry.addToDevice(this);
//  }
}


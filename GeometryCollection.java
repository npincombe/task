import java.util.Collection;
import java.util.ArrayList;

public abstract class GeometryCollection<E extends Geometry>
// implements Collection<E>
{
  private ArrayList<E> list = new ArrayList<E>();
  
  public abstract void draw(); //change to accept a device if necessary

  public boolean add(E e){
    return list.add(e);
  }  

  //implement remaining methods from collection
}


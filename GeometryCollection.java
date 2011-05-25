import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class GeometryCollection<E extends Geometry> implements Collection<E> {
    private ArrayList<E> list = new ArrayList<E>();

    public void drawToDevice(Device device){
      for(E e : list){
        device.drawGeometry(e);
      }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public Iterator<E> iterator() {
        return list.iterator();
    }

    public Object[] toArray() {
        return list.toArray();
    }

    public <T> T[] toArray(T[] ts) {
        return list.toArray(ts);
    }

    public boolean add(E e) {
        return list.add(e);
    }

    public boolean remove(Object o) {
        return list.remove(o);
    }

    public boolean containsAll(Collection<?> objects) {
        return list.containsAll(objects);
    }

    public boolean addAll(Collection<? extends E> es) {
        return list.addAll(es);
    }

    public boolean removeAll(Collection<?> objects) {
        return list.removeAll(objects);
    }

    public boolean retainAll(Collection<?> objects) {
        return list.retainAll(objects);
    }

    public void clear() {
        list.clear();
    }
}


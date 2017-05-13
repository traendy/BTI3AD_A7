import java.util.List;

/**
 * Binärbaum, der seine Daten über Knoten und pointer verwaltet
 * 
 * @author peter
 *
 * @param <T>
 *   Type der Daten
 */
public class PointerBaum<T extends Comparable<T> > implements Baum<T>{

  private Knoten<T> wurzelknoten = null;

  @Override
  public T einfuegen(T datum) {
    // TODO Auto-generated method stub
    return datum;
  }

  @Override
  public T rechtesKind(T wurzel) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public T linkesKind(T wurzel) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<T> inOrder() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<T> preOrder() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<T> postOrder() {
    // TODO Auto-generated method stub
    return null;
  }
  
  
}

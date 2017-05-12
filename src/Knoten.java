/**
 * Knoten eines binären Baumes 
 * @author Grupp1
 *
 * @param <T> Objekt dass im knoten liegen soll
 */
public class Knoten<T extends Comparable<T> > implements Comparable<T> {
  /**
   * Zeiger auf die Kinder des Knotens
   */
  private Knoten rechtesKind =null;

  private Knoten linkesKind =null;
  
  /**
   * Daten im Knoten
   */
  private T data = null;

  /**
   * Default Konstruktor
   */
  public Knoten(){  
  }
  /**
   * Full Konstruktor
   * @param r right child
   * @param l left child
   * @param d data
   */
  public Knoten(Knoten r, Knoten l, T d){
    this.rechtesKind=r;
    this.linkesKind = l;
    this.data = d;
  }
  /**
   * data konstruktor
   * @param d data
   */
  public Knoten(T d){
    this.data = d;
  }
  
  
  @Override
  public String toString() {
    return "Knoten [data=" + data + "]";
  }

  @Override
  public int compareTo(T o) {
    // TODO Auto-generated method stub
    return 0;
  }

  public Knoten getRechtesKind() {
    return rechtesKind;
  }

  public void setRechtesKind(Knoten rechtesKind) {
    this.rechtesKind = rechtesKind;
  }

  public Knoten getLinkesKind() {
    return linkesKind;
  }

  public void setLinkesKind(Knoten linkesKind) {
    this.linkesKind = linkesKind;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
  
  
}

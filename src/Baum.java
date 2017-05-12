
public interface Baum<T extends Comparable<T> > {
  
  public void einfuegen(Knoten<T> neuerKnoten);
  public Knoten<T> rechterKnoten(Knoten<T> wurzel);
  public Knoten<T> linkeKnoten(Knoten<T> wurzel);
  public void inOrder();
  public void preOrder();
  public void postOrder();

}

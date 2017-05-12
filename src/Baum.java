/**
 * Bin�rbaum Interface
 * 
 * @author peter und s�hne e.V.
 *
 * @param <T>
 *   Type des Bin�rbaumes
 */
public interface Baum<T extends Comparable<T> > {
  /**
   * Einf�gen eines Knotens in den Baum
   * @param datum 
   *   F�gt ein neues Objekt an die rictige Stelle ein
   */
  public void einfuegen(T datum);
  
  /**
   * Ausgabe des rechten Kindes eines Wurzelknotens
   * @param wurzel
   *   Das Eltern des Kindes
   * @return rechtes Kind
   */
  public T rechtesKind(T wurzel);
  
  /**
   * Ausgabe des linken Kindes eines Wurzelknotens
   * @param wurzel
   *   Das Eltern des Kindes
   * @return linkes Kind
   */
  public T linkesKind(T wurzel);
  
  /**
   * Ausgabe des Baumes in Order
   */
  public void inOrder();
  
  /**
   * Ausgabe des Baumes preOrder
   */
  public void preOrder();
  
  /**
   * Ausgabe des Baumes PostOrder
   */
  public void postOrder();

}

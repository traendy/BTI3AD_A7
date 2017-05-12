import java.util.ArrayList;
/**
 * Bin�rbaum, der seine Daten in einem Array(List) verwaltet
 * @author kallotti
 *
 * @param <T>
 *   Type der Daten 
 */
public class ArrayBaum<T extends Comparable<T>> implements Baum<T> {

  /**
   * Datenkontainer (Arrayersatz)
   * ArrayList, damit die Speicherallokation nicht implementiert werden muss
   */
  private ArrayList<T> array;
  /**
   * Konstruktor
   * @param len
   *   Initialgroesse
   */
  public ArrayBaum(int len){
    array = new ArrayList<T>(len);
  }
  
  @Override
  public void einfuegen(T datum) {

  }

  @Override
  public T rechtesKind(T wurzel) {
    return null;
  }

  @Override
  public T linkesKind(T wurzel) {
    return null;
  }
  
  @Override
  public void inOrder() {

  }
  
  @Override
  public void preOrder() {

  }
  
  @Override
  public void postOrder() {

  }
  //-------------------------------------------------------- hilfsmethoden
  
  /**
   * Gibt Position (Index) des rechten Kindes zurueck
   * @param wurzelIndex
   *   Index des Eltern des Kindes
   * @return Index des rechten Kindes
   */
  private int rechtesKindIndex(int wurzelIndex) {
    int kindIndex = 2 * wurzelIndex + 1;

    return kindIndex;
  }
  
  /**
   * Gibt Position (Index) des linken Kindes zurueck
   * @param wurzelIndex
   *   Index des Eltern des Kindes
   * @return Index des linken Kindes
   */
  private int linkesKindIndex(int wurzelIndex) {
    int kindIndex = 2 * wurzelIndex;

    return kindIndex;
  }
  
  /**
   * Gibt Position (Index) des gesuchten Datums zurueck
   * @param datum
   *   interessantes Datum
   * @return Index des Datums
   */
  private int getIndex(T datum) {
    int index = 0;
    return index;
  }

}

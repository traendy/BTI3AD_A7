import java.util.ArrayList;
/**
 * Binärbaum, der seine Daten in einem Array(List) verwaltet
 * @author kallotti
 *
 * @param <T>
 *   Type der Daten 
 */
public class ArrayBaum<T extends Comparable<T>> implements Baum<T> {

  /**
   * Index der nicht erlaubt ist.
   * Wird zurückgegeben bei Unerreichbarkeit  (NOT FOUND)
   */
  private static final int VOID = 0; 
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
    // erste Stelle 0 ist mit dem Algo nicht machbar (bleibt frei)
    array = new ArrayList<T>(len+1);
  }
  
  @Override
  public void einfuegen(T datum) {

  }

  @Override
  public T rechtesKind(T wurzel) {
    int wurzelIndex = getIndex(wurzel);
    int kindIndex = rechtesKindIndex(wurzelIndex);
    T kind = array.get(kindIndex);
    return kind;
  }

  @Override
  public T linkesKind(T wurzel) {
    int wurzelIndex = getIndex(wurzel);
    int kindIndex = linkesKindIndex(wurzelIndex);
    T kind = array.get(kindIndex);
    return kind;
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
    int kindIndex = wurzelIndex > VOID ? 2 * wurzelIndex + 1 : VOID;
    return kindIndex;
  }
  
  /**
   * Gibt Position (Index) des linken Kindes zurueck
   * @param wurzelIndex
   *   Index des Eltern des Kindes
   * @return Index des linken Kindes
   */
  private int linkesKindIndex(int wurzelIndex) {
    int kindIndex = wurzelIndex > VOID ? 2 * wurzelIndex : VOID;
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
  
  private T getDatum(int index){
    return index > VOID ? array.get(index): null;
  }

}

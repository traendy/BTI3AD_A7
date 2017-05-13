import java.util.ArrayList;
import java.util.List;
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
   * ArrayContainer, welcher uns das Array neu allokiert wenn nötig
   */
  private ArrayContainer<T> array;
  
  /**
   * DefaultKonstruktor mit 63 Platz
   */
  public ArrayBaum(){
    this(63);
  }
  
  /**
   * Konstruktor
   * @param len
   *   Initialgroesse
   */
  public ArrayBaum(int len){
    // erste Stelle 0 ist mit dem Algo nicht machbar (bleibt frei)
    array = new ArrayContainer<T>(len+1);
    array.set(VOID, null);
  }
  
  @Override
  public T einfuegen(T datum) {
    T res = datum;
    return res;
  }

  @Override
  public T rechtesKind(T wurzel) {
    int wurzelIndex = getIndex(wurzel);
    int kindIndex = rechtesKindIndex(wurzelIndex);
    T kind = getDatum(kindIndex);
    return kind;
  }

  @Override
  public T linkesKind(T wurzel) {
    int wurzelIndex = getIndex(wurzel);
    int kindIndex = linkesKindIndex(wurzelIndex);
    T kind = getDatum(kindIndex);
    return kind;
  }
  
  @Override
  public List<T> inOrder() {
    ArrayList<T> list = new ArrayList<T>();
    return list;
  }
  
  @Override
  public List<T> preOrder() {
    ArrayList<T> list = new ArrayList<T>();
    return list;
  }
  
  @Override
  public List<T> postOrder() {
    ArrayList<T> list = new ArrayList<T>();
    return list;
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
   * Gibt die Position vom Eltern (Vaddern) zuruek.
   * @param kindIndex
   *   Index vom Kind
   * @return Index vom Eltern des Kindes )
   *   Wenn = 0 -> kind war wurzel
   */
  @SuppressWarnings("unused")
  private int elterIndex(int kindIndex)
  {
    return kindIndex / 2; 
  }

  /**
   * Gibt Position (Index) des gesuchten Datums zurueck
   * @param datum
   *   interessantes Datum
   * @return Index des Datums
   */
  private int getIndex(T datum) {
    int index = VOID+1; // Baumwurzel
    int compare = -1;
    while (compare != 0 && index <= array.size()) {
      compare = datum.compareTo(getDatum(index));
      if (compare < 0){
        index = linkesKindIndex(index);
      }else{
        index = rechtesKindIndex(index);
      }
    }
    return index;
  }
  
  
  /**
   * Gibt den WErt (das Datum) an der indexstelle zurück
   * @param index 
   *   Position des interessierenden Datums 
   * @return
   *   Datum, an der Stelle index
   */
  private T getDatum(int index){
    return index > VOID ? array.get(index): null;
  }

}

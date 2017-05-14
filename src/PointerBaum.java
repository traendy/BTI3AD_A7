import java.util.ArrayList;
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
  
  public static int testCounter =0;
  
  public PointerBaum (){
    setWurzelknoten(new Knoten<T>());
  }

  
  public PointerBaum (T datum){
    setWurzelknoten(new Knoten<T>(datum));
  }

  @Override
  public T einfuegen(T datum) {
   Knoten<T> k = new Knoten<T>(datum);
   fuegeAmEndeEin(this.wurzelknoten, k);
    return datum;
  }

  private void fuegeAmEndeEin(Knoten<T> wurzel, Knoten<T> neuK) {
   
  if(wurzel.getData().compareTo(neuK.getData())>0){
    if(wurzel.getLinkesKind()==null){
      wurzel.setLinkesKind(neuK);
      testCounter++;
      return;
    }else{
      fuegeAmEndeEin(wurzel.getLinkesKind(), neuK);
    }
    
  }else{
    if(wurzel.getRechtesKind()==null){
      wurzel.setRechtesKind(neuK);
      testCounter++;
    }else{
      fuegeAmEndeEin(wurzel.getRechtesKind(), neuK);
    }
  }
        
  }


  @Override
  public T rechtesKind(T wurzel) {
   Knoten<T> k=findeWurzel(wurzel);
   return k.getRechtesKind().getData();
  }

  private Knoten<T> findeWurzel(T wurzel) {
    Knoten<T> k = new Knoten<T>(wurzel);
    if(!k.getData().equals(wurzel)){
      k=findeWurzel(k.getLinkesKind().getData());
      k=findeWurzel(k.getRechtesKind().getData());
    }
    return k;
    
    
  }


  @Override
  public T linkesKind(T wurzel) {
    Knoten<T> k=findeWurzel(wurzel);
    return k.getLinkesKind().getData();
  }

  @Override
  public List<T> inOrder() {
    ArrayList<T> list = new ArrayList<T>();
    list= inOrderHelper(list, wurzelknoten);
    return list;
  }

  /**
   * Test it 
   * @param list
   * @param wurzel
   * @return
   */
  private ArrayList<T> inOrderHelper(ArrayList<T> list, Knoten<T> wurzel) {
    if(wurzel.getLinkesKind()==null && wurzel.getRechtesKind()==null){
     
      return list;
    }else{
      list.add(wurzel.getData());
      if(wurzel.getLinkesKind()!=null)list.addAll(inOrderHelper(list, wurzel.getLinkesKind()));
      if(wurzel.getRechtesKind()!=null) list.addAll(inOrderHelper(list, wurzel.getRechtesKind()));
      return list;
      }

  
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

  public Knoten<T> getWurzelknoten() {
    return wurzelknoten;
  }

  public void setWurzelknoten(Knoten<T> wurzelknoten) {
    this.wurzelknoten = wurzelknoten;
  }
  //inOrder
  public void display(Knoten<T> root){
    if(root!=null){
      display(root.getLinkesKind());
      System.out.print(" " + root.getData());
      
      display(root.getRechtesKind());
    }
  }
  
}

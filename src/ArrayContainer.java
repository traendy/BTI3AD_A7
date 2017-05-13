
public class ArrayContainer<T> {

  private T[] array;
  
  int contain = 0;
  
  
  @SuppressWarnings("unchecked")
  public ArrayContainer(int len){
    array = (T[]) new Object[len];
  }
  
  public void set(int index, T obj) 
      throws IndexOutOfBoundsException
  {
    if (index < 0)
    {
      throw new IndexOutOfBoundsException();
    }
    if (index >= array.length){
      @SuppressWarnings("unchecked")
      T[] tmp = (T[]) new Object[index+1];
      System.arraycopy(array, 0, tmp, 0, array.length);
    }
    array[index]= obj;
    contain++;
  }
  
  
  public T get(int index)
      throws IndexOutOfBoundsException
  { 
    if (index > array.length || index < 0)
    {
      throw new IndexOutOfBoundsException();
    }
    return array[index];
  }
  
  public T remove(int index) 
      throws IndexOutOfBoundsException
  {
    if (index > array.length || index < 0)
    {
      throw new IndexOutOfBoundsException();
    }
    T tmp = get(index);
    set(index, null);
    contain--;
    return tmp;
  }
  
  public int size(){
    return array.length;
  }
  
  public int nContain(){
    return contain;
  }
  
}

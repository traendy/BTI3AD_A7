import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class ArrayBaumTest {

  //   1
  //    2
  //     3
  //      4
  //       5
  //        6
  @Test
  public void testEinf�gen() {
    ArrayBaum<Integer> baum = new ArrayBaum<Integer>();
    
    baum.einfuegen(1);
    baum.einfuegen(2);
    baum.einfuegen(3);
    baum.einfuegen(4);
    baum.einfuegen(5);
    baum.einfuegen(6);
    List<Integer> inO = baum.inOrder();
    assertEquals(inO.get(0),(Integer) 1);
    List<Integer> preO = baum.preOrder();
    assertEquals(preO.get(0),(Integer) 1);
    List<Integer> postO = baum.postOrder();
    assertEquals(postO.get(0),(Integer) 6);
  }
  
  
  //           4
  //           '
  //       2       6
  //       '       '
  //     1   3   5   7
  //     '   '   '   '
  // -> 1 2 3 4 5 6 7
  @Test
  public void testInOrder() {
    ArrayBaum<Integer> baum = new ArrayBaum<Integer>();
    
    baum.einfuegen(4);    
      baum.einfuegen(2);
        baum.einfuegen(1);
        baum.einfuegen(3);  
      baum.einfuegen(6);
        baum.einfuegen(5);
        baum.einfuegen(7);
    List<Integer> inO = baum.inOrder();
    assertEquals(inO.get(0),(Integer) 1);
    assertEquals(inO.get(1),(Integer) 2);
    assertEquals(inO.get(2),(Integer) 3);
    assertEquals(inO.get(3),(Integer) 4);
    assertEquals(inO.get(4),(Integer) 5);
    assertEquals(inO.get(5),(Integer) 6);
    assertEquals(inO.get(6),(Integer) 7);
  }
  
  //           -4
  //       -2      -6
  //     -1  -3  -5  -7
  // -> 4 2 1 3 6 5 7
  @Test
  public void testPreOrder() {
    ArrayBaum<Integer> baum = new ArrayBaum<Integer>();
    
    baum.einfuegen(4);
      baum.einfuegen(2);
        baum.einfuegen(1);
        baum.einfuegen(3);  
      baum.einfuegen(6);
        baum.einfuegen(5);
        baum.einfuegen(7);
    List<Integer> preO = baum.preOrder();
    assertEquals(preO.get(0),(Integer) 4);
    assertEquals(preO.get(1),(Integer) 2);
    assertEquals(preO.get(2),(Integer) 1);
    assertEquals(preO.get(3),(Integer) 3);
    assertEquals(preO.get(4),(Integer) 6);
    assertEquals(preO.get(5),(Integer) 5);
    assertEquals(preO.get(6),(Integer) 7);
  }
  
//             4-
//        2-        6-
//     1-   3-   5-   7-
// -> 1 3 2 5 7 6 4
  @Test
  public void testPostOrder() {
    ArrayBaum<Integer> baum = new ArrayBaum<Integer>();
    
    baum.einfuegen(4);   
      baum.einfuegen(2);   
        baum.einfuegen(1);
        baum.einfuegen(3);   
      baum.einfuegen(6);   
        baum.einfuegen(5);
        baum.einfuegen(7);
    
    List<Integer> postO = baum.postOrder();
    assertEquals(postO.get(0),(Integer) 1);
    assertEquals(postO.get(1),(Integer) 3);
    assertEquals(postO.get(2),(Integer) 2);
    assertEquals(postO.get(3),(Integer) 5);
    assertEquals(postO.get(4),(Integer) 7);
    assertEquals(postO.get(5),(Integer) 6);
    assertEquals(postO.get(6),(Integer) 4);
  }

}

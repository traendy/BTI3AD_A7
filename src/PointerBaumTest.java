import static org.junit.Assert.*;

import java.util.List;


import org.junit.Before;
import org.junit.Test;

public class PointerBaumTest {

  PointerBaum<Integer> baum;
  private int data = 8;
  
  
  public void prepareBaum(){
   baum = new PointerBaum<Integer>(data); 
   baum.einfuegen(7);
   baum.einfuegen(9);
   baum.einfuegen(6);
   baum.einfuegen(8);
   baum.einfuegen(8);
   baum.einfuegen(10);
   System.out.println(baum.testCounter);
  }
  
  @Test
  public void testEinfuegen() {
    fail("Not yet implemented");
  }

  @Test
  public void testRechtesKind() {
    fail("Not yet implemented");
  }

  @Test
  public void testLinkesKind() {
    fail("Not yet implemented");
  }

  @Test
  public void testInOrder() {
    prepareBaum();
   if(baum.getWurzelknoten().equals(null)){
     System.out.println("fail");
     return;
   }
   List<Integer> list =baum.inOrder();
   StringBuilder builder = new StringBuilder();
   for(int i =0; i< list.size(); i++){
     builder.append(list.get(i));
     builder.append(", ");
   }
   System.out.println(builder.toString());
   System.out.println(list.size());
   baum.display(baum.getWurzelknoten());
  }

}

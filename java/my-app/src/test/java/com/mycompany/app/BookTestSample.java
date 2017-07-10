package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
public class BookTestSample
{
  private int id;
private String name, author, publiser;
private int quantity;
Book book=new Book();
    
    @Test
  public void toStringTest1(){
    String tostring = book.toString();
    //assertTrue(tostring.contains( "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
//+ quantity));
  
      assertEquals(tostring,book.toString());

  }
}
 /* @Test

public void toStringTest2()
{
  String tostring1 = book.toString();
  assertTrue(tostring1.contains( "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity));
}
}*/

/*

public void toStringTest2(){
    String tostring = book.toString();
   //String x="90";
    assertTrue(tostring.matches("[0-9]+","[a-z][A-Z]","[a-z][A-Z]","[a-z][A-Z]","[0-9]+"));
}
}
*/
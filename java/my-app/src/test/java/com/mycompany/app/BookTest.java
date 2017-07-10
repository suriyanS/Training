package com.mycompany.app;
//import com.mycompany.app.Book;
import com.mycompany.app.BookBuilder;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
//import org.junit.Before;
import org.junit.Test;


public class BookTest {
private int id;
private String name, author, publiser;
private int quantity;
	 
 Book bk=new Book();

@BeforeClass
public static void beforeclass(){
	System.out.println("@beforeclass");
}

@AfterClass
public static void afterclass(){
	System.out.println("@Afterclass");
}


 /*@Before
  public void before()
{
	System.out.println("@Before");
}
*/
@Test
public void toStringTest1(){
	String tostring = bk.toString();

   assertTrue(tostring.contains( "Book [id=" + id + ", name=" + name + ", author=" + author + ", publiser=" +publiser+ ", quantity=" + quantity + "]"));
 

  String str = new BookBuilder().setId(1).setName("C++").setAuthor("Dev").setPubliser("KIL").setQuantity(1).build().toString();
	
	System.out.println(str);
     
	  assertEquals(tostring,bk.toString());
	
	System.out.println("BOTH ARE EQUAL");
  }
  

}
 


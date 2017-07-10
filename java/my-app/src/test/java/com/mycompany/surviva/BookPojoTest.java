package com.mycompany.surviva;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BookPojoTest
{
   BookPojoMain bk=new BookPojoMain();
    BookPojoBusinessLogic bl=new BookPojoBusinessLogic();
     @Test
   public void testCreate() {
      bk.setName("vani");
      bk.setId(1);
      bk.setQty(511);
       bk.setPub("v");
        bk.setAuthor("vv");
		
      int id1 = bl.create(bk);
      assertEquals(1, id1);
   }@Test
    public void testdelate() {
      bk.setName("vani.v");
      bk.setId(1);
      bk.setQty(511);
       bk.setPub("v");
        bk.setAuthor("vv");
		
      int id = bl.delete(bk);
      assertEquals(0,id);
   }
}
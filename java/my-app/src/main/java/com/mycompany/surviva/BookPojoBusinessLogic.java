package com.mycompany.surviva;
public class BookPojoBusinessLogic
{
   public int create(BookPojoMain bk)
    {
        System.out.println("the inserted values are");
        //return (bk.getId()+" "+bk.getQty());
int id1=bk.getId();
int y=0;
//if(bk.getId()!=0 && bk.getName()!=null && bk.getPub()!=null && bk.getAuthor()!=null && bk.getQty()!=0)
if(id1!=0)
{
 y=1;
}
return y;
    }
   public int delete(BookPojoMain bk)
   {
       System.out.println("the deleted values are");
       int x= bk.getId();
       if(x!=0)
       {
         x=0;
       }
       return x;
   }
}
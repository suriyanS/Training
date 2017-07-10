
package com.kgfsl.log4j;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.ConsoleAppender;
 
public class Client {
 
  static Logger l = Logger.getLogger(Client.class.getName());
 
  public static void main(String[] args) {	  
 
	  Layout l1 = new SimpleLayout();
	  Appender a;
	  Appender c = new ConsoleAppender(l1);
	  try
	  {
	  a = new FileAppender(l1,"my.txt", true);
 
	  // 3rd parameter is true by default
	  // true = Appends the data into my.txt
	  // false = delete previous data and re-write
 
	  l.addAppender(a);
      l.addAppender(c);
	  }
	  catch(Exception e) {}	  
 
	  l.fatal("This is the error message..");
	  System.out.println("Your logic executed successfully....");
  }
}
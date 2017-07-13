 package com.mycompany.app; 
import org.junit.Test;
import  static org.junit.Assert.assertEquals;
import java.util.function.BiFunction;

public class DemoTest{

@Test
public void addtest() {
    Demo d=new Demo();
    BiFunction<Integer, Integer, Integer> adder = (a, b) -> d.add(a, b);
    int addResult = adder.apply(5, 6);
    assertEquals(11, addResult);
}
}
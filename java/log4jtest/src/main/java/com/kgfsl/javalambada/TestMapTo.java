package com.kgfsl.javalambada;
import java.util.Arrays;
import java.util.List;

public class TestMapTo {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("1","2","3","4","5");

    stringList.stream()
           .mapToDouble(n-> Long.parseLong(n) )
           .filter(n-> n%2 == 0)
           .forEach(System.out::println);
  }
}
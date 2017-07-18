package com.kgfsl.javalambada;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class Check1 {
    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        Stream<String> reuse = temp.flatMap(x->(Arrays.stream(x)));
        //filter a stream of string[], and return a string[]?
        Stream<String> stream = reuse.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

    }

}
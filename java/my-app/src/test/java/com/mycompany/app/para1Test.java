/*package com.mycompany.app;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import java.util.Collection;


import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class para1Test {


public int arg1;

public int arg2;


public para1Test(int p1, int p2) {

arg1 = p1;

arg2 = p2;

}


public int actual;


@Parameters

public static Collection<Object[]> data() {

Object[][] data = new Object[][] { { 1, 2 }, { 21, 1 }, { 1, 2 }, { 1, 2 }, { 1, 2 },

{ 5, 3 }, { 121, 4 } };

return Arrays.asList(data);

}


Calc c = new Calc();


@Test

public void parmeterisedConstructorsumTest() {

actual = c.sum(arg1, arg2);

assertEquals("Test Result", arg1 + arg2, actual);

}


}*/
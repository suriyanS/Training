/*package com.mycompany.app;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import java.util.Collection;


import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameter;

import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class paraTest {

@Parameter(0)

public int arg1;

@Parameter(1)

public int arg2;

@Parameter(2)

public int expected;

public int actual;


@Parameters

public static Collection<Object[]> data() {

Object[][] data = new Object[][] { { 1, 2, 3 }, { 2147, 1, 2148 }, { 1, 2, 3 }, { 1, 2, 3 },

{ 1, 2, 3 }, { 5, 3, 8 }, { 121, 4, 125 } };

return Arrays.asList(data);

}


Calc c = new Calc();


@Test

public void parmeterisedsumTest() {

actual = c.sum(arg1, arg2);

assertEquals("Test Result", expected, actual);

}

}*/
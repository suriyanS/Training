package com.kgfsl.javalambada;
public class JavaLambdaDemo {
	public static void main(String args[]) {
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Java Lambda"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
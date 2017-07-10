package com.kgfsl.javalambada;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.say();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.println("Hello World from Lambda Greetings");

		Greeting innerClassGreeting = new Greeting() {
			public void say() {
				System.out.println("Hello World from Inner Class Greeting");
			}
		};

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}
}		
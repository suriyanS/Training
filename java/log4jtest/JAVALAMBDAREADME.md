## Java 8 features
[Default methods in interface](https://www.javatpoint.com/java-default-methods)
### Java Lambda
[Java Anonymous inner class](https://www.javatpoint.com/anonymous-inner-class)

```
package javalambada;

public interface Greeting {
	public void say();
}
```
```
package javalambada;

public class HelloGreeting implements Greeting{

	public void say() {
		System.out.println("Hello World");
		
	}

}
```
```
package javalambada;

public class Greeter {
public void greet(Greeting greeting){
	greeting.say();
}

public static void main(String[] args) {
	Greeter greeter=new Greeter();
	HelloGreeting helloGreeting=new HelloGreeting();
	greeter.greet(helloGreeting);
}
}
```

In Greeter class
```
public void greet(action){
	action();
}
```

Function as value
```
public void say() {
		System.out.println("Hello World");
		
	}
```	
aBlockOfCode=public void say() {
		System.out.println("Hello World");
		
	}	
```
Lambda Expression
```
aBlockOfCode=() {
		System.out.println("Hello World");
		
	}	
```
```	
aBlockOfCode=() -> {
		System.out.println("Hello World");
		
	}	
```
```
aBlockOfCode=() -> System.out.println("Hello World");

greet(greetingFunction);

public void greet(____){
_____
}
```
```
greet(() -> System.out.println("Hello World"););

public void greet(____){
_____
}
```
```
doubleNumberFunction=public int double(int a){
return a * 2;
}

doubleNumberFunction=(int a) -> a * 2;

addFunction = (int a, int b) -> a+b;

divideFunction = (int a, int b) -> {
if (b==0) return 0;
};

stringLength=(String s) -> s.length();
```
```
package javalambada;

public class Greeter {
public void greet(Greeting greeting){
	greeting.say();
}


public static void main(String[] args) {
	Greeter greeter=new Greeter();
	HelloGreeting helloGreeting=new HelloGreeting();
	greeter.greet(helloGreeting);
	
	myLambda myLambdaFunction=()->System.out.println("Hello World from Java Lambda !");
	myLambdaFunction.sayHello();
}
}


interface myLambda {
	void sayHello();
}

```
```
package javalambada;

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
```	
	
```
package javalambada;

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
```

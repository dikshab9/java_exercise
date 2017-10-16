package io.javabrains;

public class Greeter {
	public void Greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		HelloWorldGreeting helloworldgreeting=new HelloWorldGreeting();
		greeter.Greet(helloworldgreeting);

	}

}

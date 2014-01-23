package inner;

interface Greeter {
	void greet();
}

public class AnonymousExample{
	public void doSomething() {
		Greeter greeter = new Greeter() {
			@Override
			public void greet() {
				System.out.println("anonymousexample");
			}
		};
		greeter.greet();
	}
}

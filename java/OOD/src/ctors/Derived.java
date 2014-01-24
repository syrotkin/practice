package ctors;

public class Derived extends Base {
	
	Object a;
	
	public Derived() {
		super(); // super() is automatically inserted by the compiler
		System.out.println("Constructing derived");
		a = new Object();
	}
	
	public void someBase() {
		System.out.println("Printed in Derived");
		System.out.println(a.toString()); // NullPointerException! Because the virtual method is called from the constructor
	}
}

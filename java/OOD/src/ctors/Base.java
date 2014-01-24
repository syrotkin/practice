package ctors;

public class Base extends Grandparent {
	/**
	 * The perils of calling a virtual method from the constructor.
	 */
	public Base() {
		System.out.println("constructing Base");
		System.out.println(this.getClass()); // !! Gets the most specific class!!
		//someBase(); 
	}
	
	public void someBase() {
		System.out.println("Printed in Base");
	}
}

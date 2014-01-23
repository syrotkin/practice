package openclosed;

public class MainOpenClosed {


	public static void main(String[] args) {
		Derived ib = new Derived();
		if (ib instanceof IBase) {
			System.out.println("IBase");
		}
		if (ib instanceof Base) {
			System.out.println("Base");
		}
		if (ib instanceof IDerived) {
			System.out.println("IDerived");
		}
		if (ib instanceof Derived) {
			System.out.println("Derived");
		}
		
	}

}

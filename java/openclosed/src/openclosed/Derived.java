package openclosed;

public class Derived extends Base implements IDerived {

	@Override
	public void iderived() {
		System.out.println("iderived");
	}
	
	public void derived() {
		System.out.println("derived");
	}

}

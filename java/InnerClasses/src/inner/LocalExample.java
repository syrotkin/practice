package inner;

public class LocalExample {
	public void doSomething() {
		 final String x = "localexample"; // !! Has to be final for the local class to access it
		 
		 
		/*Cannot be public */ class Local { // !!
			public void doSomething() {
				System.out.println(x);
			}
		}
		
		Local l = new Local();
		l.doSomething();
	}
	
}

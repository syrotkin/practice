package inner;

public class NestedExample {
	
	private static String x = "nestedexample";
	
	public static class Nested {
		public void doSomething() {
			System.out.println(x);
		}
	}
}

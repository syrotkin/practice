package eratosthenes;

public class Eratosthenes {

	public static void main(String[] args) {
		printPrimeLessThan(50);

	}
	
	private static void printPrimeLessThan(int n) {
		int[] marked = new int[n]; // implicitly initialized to 0
		
		for (int p = 2; p < marked.length; ++p) {
			if (marked[p] == 0) {
				System.out.println(p);
				for (int i = p; i < marked.length; i += p) {
					marked[i] = 1;
				}
			}
		}
	}

}

package palindrome;

public class TestSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "panama, a canal: blah__";
		String a = s.replaceAll("\\W", "");
		String b = s.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(a);
		System.out.println(b);
			
	
	}

}

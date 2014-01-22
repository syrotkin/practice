package arrays;

public class Anagrams {


	public static void main(String[] args) {
		testAnagrams();
	}
	
	private static void testAnagrams() {
		String[] array1 = {"",   "", "a", "b", "ab", "aa", "bab", "aba", "abcdec"};
		String[] array2 = {null, "", "",  "b", "ab", "bb", "abb", "aab", "eabdcc"};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + ", " + array2[i] + ": " + areAnagrams(array1[i], array2[i]));
		}
	}

	private static boolean areAnagrams(String s, String t) {
		if (s == null || t== null || s.length() != t.length() ) {
			return false;
		}
		int[] sLetters = new int[65536]; // init to 0 by default
		int[] tLetters = new int[65536]; // init to 0 by default
		int i;
		for (i = 0; i < s.length(); i++) {
			sLetters[s.charAt(i)]++;
			tLetters[t.charAt(i)]++;
		}
		for (i = 0; i < sLetters.length; i++) {
			if (sLetters[i] != tLetters[i]) {
				return false;
			}
		}
		return true;
	}
	
}

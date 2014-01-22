package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class TestUnique {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testAllUnique();
	}
	
	private static void testAnagrams() {
		String[] array1 = {"aabbb", "bbbss"};
		String[] array2 = {"bbbaa", "babaa"};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + ", " + array2[i] + " " + isAnagram(array1[i], array2[i]));
		}
	}
	
	private static boolean isAnagram(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			Integer value1 = map1.get(s1.charAt(i));
			if (value1 == null) {
				map1.put(s1.charAt(i), 1);
			}
			else {
				map1.put(s1.charAt(i), value1 + 1);
			}
			Integer value2 = map2.get(s2.charAt(i));
			if (value2 == null) {
				map2.put(s2.charAt(i), 1);
			}
			else {
				map2.put(s2.charAt(i), value2 + 1);
			}
		}
		for (Entry<Character, Integer> entry : map1.entrySet()) {
			Integer value2 = map2.get(entry.getKey());
			if (value2 == null || value2 != entry.getValue()) {
				System.out.println("value1: " + entry.getValue() + ", value2: " + value2);
				return false;
			}
		}
		return true;
	}
	
	private static void testSubstrings() {
		
	}
	
	private static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int s2Length = s2.length();
		for (int i = 0; i < s2Length; i++) {
			if (s1.charAt(0) == s2.charAt(i)) {
				String s2end = s2.substring(i);
				if (isSubstring(s1, s2end)) {
					String s2begin = s2.substring(0, i);
					String s1end = s1.substring(s2end.length());
					if (s2begin.equals(s1end)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	// Checks if String s2 is a substring of s1
	private static boolean isSubstring(String s1, String s2) {
		return false;
	}
	
	private static void testReplace() {
		String s = "I am a string";
		String replaced = s.replace(" ", "%20");
		System.out.println(replaced);
	}
	
	private static void testAllUnique() {
		String[] array = {"a", "", "aa", "aba", "baba", "asdfa", "sdfgah", "Москва"};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " " + allUnique3(array[i]));
		}
	}
	
	public static boolean allUnique(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				return false;
			}
			else {
				map.put(s.charAt(i), 1);
			}
		} 
		return true;
	}
	
	public static boolean allUnique2(String s) {
		char[] cs = s.toCharArray();
		Arrays.sort(cs);
		for (int i = 0; i < cs.length; i++) {
			if (i != 0) {
				if (cs[i] == cs[i - 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean allUnique3(String s) {
		int[] array = new int[65536];
		for (int i = 0; i< s.length(); i++) {
			char val = s.charAt(i);
			//System.out.print(val + ": " + (char)val + " ");
			if (i == s.length() - 1) {
				System.out.println();
			}
			if (array[val] != 0) {
				return false;
			}
			else {
				array[val] = 1;
			}
		}
		return true;
	}
}

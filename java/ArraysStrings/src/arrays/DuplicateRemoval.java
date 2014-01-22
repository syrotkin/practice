package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoval {

	public static void main(String[] args) {
		testMyWay();
	}
	
	private static void testMyWay() {
		String s = "";
		s = myWay(s);
		System.out.println(s);
	}
	
	private static String myWay(String s) {
		StringBuffer buffer = new StringBuffer();
		Set<Character> set = new HashSet<Character>();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (!set.contains(c)) {
				buffer.append(c);
				set.add(c);
			}
		}
		return buffer.toString();
	}
	
	private static void testFindDuplicates() {
		String s = "aaaac";
		findDuplicates(s);
	}
	
	private static void testRemoveDuplicates() {
		String s = "aabc";
		char[] array = s.toCharArray();
		removeDuplicates(array);
		s = new String(array);
		System.out.println(s);
	}
	
	private static void removeDuplicates(char[] s) {
		if (s == null) {
			return;
		}
		int length = s.length;
		if (length < 2) {
			return;
		}
		
		int tail = 1;
		for (int i = 1; i < length; i++) {
			System.out.println("i = " + i + ", tail = " + tail);
			int j;
			for (j = 0; j < tail; j++) {
				System.out.println("\tj = " + j);
				if (s[i] == s[j]) {
					System.out.println("\tfound duplicate, skipping: s[" + i +"] == s[" + j +"]");
					break;
				}
			}
			if (j == tail) {
				System.out.println("\tj = " + j + ", tail = " + tail + "; copy s[" + i + "] to s[" + tail +"]" );
				s[tail] = s[i];
				++tail;
			}
		}
		if (tail < length) {
			s[tail] = 0;
		}
	}
	
	private static void findDuplicates(String s) {
		char[] array = new char[2 * s.length()];
		int counter = 0;
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					array[counter++] = s.charAt(i);
					System.out.println(i);
				}
			}
		}
		System.out.println(array);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void removeDuplicates2(char[] s) {
		int length = s.length;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

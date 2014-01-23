package palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
    	if (s == null) {
    		return false;
    	}
    	if (s.length() == 0 || s.length() == 1) {
    		return true;
    	}
    	s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
    	
    	int i = 0;
    	int j = s.length() - 1;
    	for (; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
    	return true;
    }
    
}


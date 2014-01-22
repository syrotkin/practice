package reverseinteger;

public class Solution {
    public int reverse(int x) {
        if (x == 0) {
        	return 0;
        }
    	boolean isNegative = false;
        if (x < 0) {
    		isNegative = true;
    		x = -1 * x;
    	}
    	StringBuffer buffer = new StringBuffer();
    	if (isNegative) {
    		buffer.append("-");
    	}
    	while (x != 0) {
    		int last = x % 10;
    		buffer.append(last);
    		x = x / 10;
    	}
    	return new Integer(buffer.toString());
    }
    
    public int reverse2(int x) {
    	boolean isNegative = false;
    	if (x < 0) {
    		isNegative = true;
    		x = -1 * x;
    	}
    	int copy = x;
    	int length = 0;
    	while (copy != 0) {
    		copy /= 10;
    		++length;
    	}
    	int power = 1;
    	for (int i = 1; i < length; ++i) {
    		power *= 10;
    	}
    	int result = 0;
    	while (x != 0) {
    		int last = x % 10;
    		x /= 10;
    		result += power * last;
    		power /= 10;
    	}
    	if (isNegative) {
    		result = -1 * result;
    	}
    	return result;
    }
    
}
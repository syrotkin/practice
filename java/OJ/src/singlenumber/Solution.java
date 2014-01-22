package singlenumber;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i< A.length; i++ ) {
        	if (map.containsKey(A[i])) {
        		map.put(A[i], map.get(A[i]) + 1);
        	}
        	else {
        		map.put(A[i], 1);
        	}
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
        	if (entry.getValue() == 1) {
        		return entry.getKey();
        	}
        }
        return -1;
    }
}
package twosum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, List<Integer>> indices = new HashMap<Integer, List<Integer>>();
    	//HashMap<Integer, int[]> currentIndex = new HashMap<Integer, int[]>();
        for (int i = 0; i < numbers.length; i++) {
    		if (indices.containsKey(numbers[i])) {
    			indices.get(numbers[i]).add(i + 1);
    		}
    		else {
    			List<Integer> newList = new ArrayList<Integer>();
    			newList.add(i + 1);
    			indices.put(numbers[i], newList);
    		}
        	//indices.put(numbers[i], i + 1);
    	}
    	Arrays.sort(numbers);
    	
    	int i = 0;
    	int j = numbers.length - 1;
    	while (i < j) {
    		if (numbers[i] + numbers[j] < target) {
    			i++;
    		}
    		else if (numbers[i] + numbers[j] > target) {
    			j--;
    		}
    		else {
    		
    			int oldIndex1 = indices.get(numbers[i]).get(0);
    			List<Integer> oldIndexList = indices.get(numbers[j]);
    			int oldIndex2 = oldIndexList.get(oldIndexList.size() - 1);
    			if (oldIndex1 < oldIndex2) {
    				return new int[] {oldIndex1, oldIndex2};
    			}
    			else {
    				return new int[] {oldIndex2, oldIndex1};
    			}
    			
    		}
    	}
    	return new int[0];
    }
}
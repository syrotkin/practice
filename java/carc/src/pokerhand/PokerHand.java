package pokerhand;

public class PokerHand {

	public static void main(String[] args) {
		int[][] arrays  = {{1, 1, 2, 2, 2}, 
					{1, 1, 1, 1, 1},
					{1, 2, 2, 2, 1},
					{1, 2, 1, 2, 2},
					{1, 1, 3, 4, 5}};
		
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(isTrue(arrays[i]));
		}
	}
	
	// True if there are 2 of one number and 3 of the other number in an array of 5 integers.
	// assume length = 5
	private static boolean isTrue(int[] array) {
		int int1 = array[0];
		int int2 = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] != int1) {
				int2 = array[i];
				break;
			}
		}
		if (int1 == int2) {
			return false; // it means all numbers in array are same
		}
		
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == int1) {
				count1++;
			}
			if (array[i] == int2) {
				count2++;
			}
		}
		return (count1 == 2 && count2 == 3) || (count1 == 3 && count2 == 2);
		
	}

}

package cards;

import java.util.ArrayList;
import java.util.List;

public class CardMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Card card = new Card(Card.Suit.SPADES, 2);
		System.out.println(card.getSuit().ordinal() + ", " + card.getValue());
		List<String> list = new ArrayList<String>();
		
		//ArrayList<String> employeeLevels = new ArrayList<String>(3);
		
		ArrayList<String>[] employeeLevels = new ArrayList[3];
		employeeLevels[0] = new ArrayList<String>();
		employeeLevels[0].add("fresher1");
		employeeLevels[0].add("fresher2");
		ArrayList<String> employeeLevel = employeeLevels[0];
		for (int i = 0; i < employeeLevels[0].size(); i++) {
			System.out.println(employeeLevels[0].get(i));
		}
		String a = "x" + 3;
		System.out.println(a);
	}

}

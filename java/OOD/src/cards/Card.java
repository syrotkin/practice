package cards;

public class Card {
	public static enum Suit {
		SPADES, 
		DIAMONDS,
		CLUBS,
		HEARTS
	}
	private Suit suit;
	private int value;
	public Card(Suit s, int v) {
		suit = s;
		value = v;
	}
	public Suit getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
	
}

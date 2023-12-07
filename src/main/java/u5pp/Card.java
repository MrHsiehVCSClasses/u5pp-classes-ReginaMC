package u5pp;

public class Card {
	String value;
	String suit;
	public Card() {
		this.value = "2";
		this.suit = "clubs";
	}
	
	public Card(String suit) {
		this.value = "2";
		String checkSuit;
		checkSuit = suit.toLowerCase();
		if ((checkSuit.equals("clubs")) || (checkSuit.equals("diamonds")) 
				|| (checkSuit.equals("hearts")) || (checkSuit.equals("spades"))) {
			this.suit = checkSuit;
		}
		else {
			this.suit = "clubs";
		}
	}
	
	public Card(String suit, String value){
		String checkSuit;
		checkSuit = suit.toLowerCase();
		if ((checkSuit.equals("clubs")) || (checkSuit.equals("diamonds")) 
				|| (checkSuit.equals("hearts")) || (checkSuit.equals("spades"))) {
			this.suit = checkSuit;
		}
		else {
			this.suit = "clubs";
		}
		String checkValue;
		checkValue = value.toLowerCase();
		if ((checkValue.equals("2")) || (checkValue.equals("3")) 
				|| (checkValue.equals("4")) || (checkValue.equals("5")) 
				|| (checkValue.equals("6")) || (checkValue.equals("7")) 
				|| (checkValue.equals("8")) || (checkValue.equals("9")) 
				|| (checkValue.equals("10")) || (checkValue.equals("jack")) 
				|| (checkValue.equals("queen")) || (checkValue.equals("king")) 
				|| (checkValue.equals("ace"))) {
			this.value = checkValue;
		}
		else {
			this.value = "2";
		}
	}
	
	public String getValue() {
		return value;
	}
	public String getSuit() {
		return suit;
	}
	public String toString() {
		return "The " + value + " of " + suit;
	}
	
	public boolean equals(Card c) {
		if ((this.value.equals(c.value)) && (this.suit.equals(c.suit))) {
			return true;
		}
		else {return false;}
	}
	
	public void changeSuit(String suit) {
		String checkSuit;
		checkSuit = suit.toLowerCase();
		if ((checkSuit.equals("clubs")) || (checkSuit.equals("diamonds")) 
				|| (checkSuit.equals("hearts")) || (checkSuit.equals("spades"))) {
			this.suit = checkSuit;
		}	
	}
	public void changeValue(String value) {
		String checkValue;
		checkValue = value.toLowerCase();
		if ((checkValue.equals("2")) || (checkValue.equals("3")) 
				|| (checkValue.equals("4")) || (checkValue.equals("5")) 
				|| (checkValue.equals("6")) || (checkValue.equals("7")) 
				|| (checkValue.equals("8")) || (checkValue.equals("9")) 
				|| (checkValue.equals("10")) || (checkValue.equals("jack")) 
				|| (checkValue.equals("queen")) || (checkValue.equals("king")) 
				|| (checkValue.equals("ace"))) {
			this.value = checkValue;
		}
	}
}

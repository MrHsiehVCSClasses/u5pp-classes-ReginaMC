package u5pp;

public class Dice {
	int numSides;
	int currentSide;
	String color;
	
	public Dice() {
		numSides = 6;
		currentSide = 1;
		color = "green";
	}
	public Dice(int numSides) {
		this.numSides = numSides;
	}
	public Dice(int numSides, int currentSide) {
		this.numSides = numSides;
		this.currentSide = currentSide;
		if (currentSide > numSides) {
			this.currentSide = 1;
		}
	}
	public Dice(int numSides, int currentSide, String color) {
		this.numSides = numSides;
		this.currentSide = currentSide;
		this.color = color;
		if (currentSide > numSides) {
			this.currentSide = 1;
		}
	}
	public int getSides() {
		return numSides;
	}
	public int getCurrentSide() {
		return currentSide;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return "The " + color + " " + "sided dice is showing " + getCurrentSide();
	}
	public boolean equals(Dice d) {
		if (d.getCurrentSide() == this.currentSide) {
			return true;
		}
		else {return false;}
	}
	public int roll() {
		currentSide = (int)(Math.random()* numSides + 1);
		return currentSide;
	}
	public void changeSide(int num){
		if ((num >= 1) && (num <= numSides)) {
			currentSide = num;
		}
	}
	public void changeColor(String color) {
		this.color = color;
	}
	public void changeNumSides(int num) {
		numSides = num;
	}
	
}

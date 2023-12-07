package u5pp;

import java.util.Scanner;

public class InputHelper {
	private Scanner input;
	public String a;
	public int num;
	
	public InputHelper(Scanner scanner) {
		input = scanner;
	}
	
	public boolean getYesNoInput(String prompt) {
		System.out.println(prompt);
		a = input.nextLine().toLowerCase(); 
		if (a.startsWith("n")) {
			System.out.println("working");
		}
		while (!((a.startsWith("y")) || (a.startsWith("n")))){
			System.out.println("Invalid input- try again");
			System.out.println("please answer '(y)es' or '(n)o'");
			a = input.nextLine().toLowerCase();
		}
		if (a.startsWith("y")) {
			return true;
		}
		if (a.startsWith("n")) {
			return false;
		}
		else {
			return false;
		}
		 
	}
	public int getIntegerInput(String prompt, int min, int max) {
		System.out.println(prompt);
		num = input.nextInt();
		while ((num < min) || (num > max)) {
			if (num < min) {
				System.out.println("Invalid input - too low, please try again");
			}
			else {
				System.out.println("Invalid input - too high, please try again");
			}
			num = input.nextInt();
		}
		return num; 
	}
	
}

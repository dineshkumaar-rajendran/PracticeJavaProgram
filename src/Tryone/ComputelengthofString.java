package Tryone;

import java.util.Scanner;

public class ComputelengthofString {
	public static void main(String[] args) {
		computeLength();
	}

	public static void computeLength() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to compute the length :");
		String name = scan.nextLine();
		name = name.replace(" ", "");
		System.out.println("Entered String with removed spaces " + name);
		char c[] = name.toCharArray();
		int size = c.length;
		int counter = 0;

		for (int i = 0; i < size; i++) {
			counter++;
		}
		System.out.println("The Length  of the String " + name + " is " + counter);
		scan.close();
	}

}

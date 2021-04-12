package Tryone;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check the palindrome :");
		String name = scan.nextLine();
		name = name.replace(" ", "");
		name = name.toUpperCase();	
		System.out.println("Entered String with removed spaces and case change " + name);
		char c[] = name.toCharArray();
		int size = c.length;
		char n[] = new char[size];

		for (int i = 0; i < size; i++) {
			n[size - 1 - i] = c[i];
		}

		String rev = new String(n);
		System.out.println("The Original string is " + name);
		System.out.println("The Reversed string is " + rev);

		for (int i = 0; i < size; i++) {
			if (n[i] == c[i]) {

			}else {
				System.out.println("The Given String " + name + " is not a Palindrome");
				System.exit(0);
			}

		}

		System.out.println("The Given String " + name + " is a Palindrome");
	}
}

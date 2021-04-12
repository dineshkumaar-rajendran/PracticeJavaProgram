package Tryone;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String Original = scan.nextLine();
		scan.close();

		char c[] = Original.toCharArray();
		int size = Original.length();
		char ne[] = new char[size];
		for (int i = 0; i < size; i++) {
			ne[size - 1 - i] = c[i];
		}
		
		String Reversed = new String(ne);
		System.out.println("The Original STring is "+Original);
		System.out.println("The reversed STring is "+Reversed);
	}
}

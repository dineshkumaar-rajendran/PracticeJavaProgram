package Tryone;

import java.util.Scanner;

public class DeletetheOccuranceofGivenCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the Character");
		char chraca = 'A';
		System.out.println("Enter the String");
		String string = scan.nextLine();
		string = string.toUpperCase();
		char c[] = string.toCharArray();
		String temp = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i]!=chraca) {
				temp += c[i];
			}
		}
		System.out.println("After deleting the occurance "+temp);
	}
}

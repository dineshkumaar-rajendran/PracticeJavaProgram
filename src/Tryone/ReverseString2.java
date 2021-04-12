package Tryone;

import java.util.Scanner;

public class ReverseString2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String Original = scan.nextLine();
		scan.close();
		String Reversed = "";
		int length = Original.length();
		for (int i=length-1; i >= 0; i--) {
			Reversed += Original.charAt(i);
		}
		System.out.println("The Original STring is " + Original);
		System.out.println("The reversed STring is " + Reversed);
	}
}

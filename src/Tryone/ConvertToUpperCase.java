package Tryone;

import java.util.Scanner;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to Convert to uppercase");
		String Original = scan.nextLine();
		Original = Original.replace(" ","");
		Original = Original.toLowerCase();
		scan.close();
		char c[] = Original.toCharArray();
		int size = Original.length();
		char n[] = new char[size];
		for (int i = 0; i < size; i++) {
			n[i] = (char)(c[i]-32);
		}
		
		System.out.println(c);
		System.out.println(n);
	}
}

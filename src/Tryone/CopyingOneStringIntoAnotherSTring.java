package Tryone;

import java.util.Scanner;

public class CopyingOneStringIntoAnotherSTring {
	
	public static void main(String[] args) {
		CopyString();
	}

	public static void CopyString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String name = scan.nextLine();
		scan.close();
		char c[] = name.toCharArray();
		int size = c.length;
		char n[] = new char[size];

		for (int i = 0; i < size; i++) {
			n[i]=c[i];
		}
		
		String Copied = new String(n);
		System.out.println("The Original STring is "+name);
		System.out.println("The Copied STring is "+Copied);
		
		
		
	}
}

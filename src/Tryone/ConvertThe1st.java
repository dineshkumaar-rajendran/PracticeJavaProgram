package Tryone;

import java.util.Scanner;

public class ConvertThe1st {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to Convert ");
		String Original = scan.nextLine();
		//Original = Original.replace(" ", "");
		Original = Original.toLowerCase();
		scan.close();
		char c[] = Original.toCharArray();
		c[0] = (char) (c[0] - 32);                                                                     
		for (int i = 0; i < Original.length(); i++) {
			if (c[i] == '\s') {
				c[i + 1] = (char) (c[i+1] - 32);
			}
		}
		
		System.out.println(c);
	}
}

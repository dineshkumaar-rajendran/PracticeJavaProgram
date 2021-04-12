package Tryone;

import java.util.Scanner;

public class CheckOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to Convert ");
		String Original = scan.nextLine();
		Original = Original.replace(" ", "");
		Original = Original.toUpperCase();
		scan.close();
		char c[] = Original.toCharArray();
		int VowelCount = 0;
		int constantsCount = 0;
		int NumberCount = 0;
		int SplcharactersCount = 0;
		for (int i = 0; i < Original.length(); i++) {
			if(c[i]>='A' && c[i] <='Z') {
			
			if (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
				VowelCount++;
			} else  {
				constantsCount++;
			} 
			
			}else if (c[i] >= '0' && c[i] <= '9') {
				NumberCount++;
			} else {
				SplcharactersCount++;
			}
		}

		System.out.println("The number of Vowels in the word " + Original + " is " + VowelCount);
		System.out.println("The number of constants in the word " + Original + " is " + constantsCount);
		System.out.println("The number of  Number in the word " + Original + " is " + NumberCount);
		System.out.println("The number of  Splcharacters in the word " + Original + " is " + SplcharactersCount);
	}
}

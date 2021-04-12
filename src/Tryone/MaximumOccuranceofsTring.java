package Tryone;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MaximumOccuranceofsTring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check the non repeated characters");
		String string = scan.nextLine();
		string = string.replace(" ", "");
		char c[] = string.toCharArray();
		int size = c.length;
		int Maxvalue = 0;
		char Maxkey = ' ';
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			if (map.containsKey(c[i]) == false) {
				map.put(c[i], 1);
			} else {
				int OldVal = map.get(c[i]);
				int NewVal = OldVal + 1;
				map.put(c[i], NewVal);
			}
		}
		
		for(Map.Entry<Character, Integer> data: map.entrySet()) {
			if(data.getValue() > Maxvalue) {
				Maxvalue = data.getValue();
				Maxkey = data.getKey();
			}
		}
		System.out.println("Key "+ Maxkey+ " Value "+Maxvalue);	
	}

}

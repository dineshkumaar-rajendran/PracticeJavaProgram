package Tryone;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveTheDuplicateCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scan.nextLine();
		string = string.toUpperCase();
		string = string.replace(" ", "");
		Map<Character, Integer> map = new LinkedHashMap<>();
		String temp = "";

		char c[] = string.toCharArray();
		int size = c.length;
		for (int i = 0; i < size; i++) {
			if (!map.containsKey(c[i])) {
				map.put(c[i], 1);
			} else {
				int OldVal = map.get(c[i]);
				int NewVal = OldVal + 1;
				map.put(c[i], NewVal);
			}
		}
		
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			if (data.getValue() == 1) {
				temp += data.getKey();
			}
		}
		System.out.println("After removal of dupliacte character : "+temp);
	}
}

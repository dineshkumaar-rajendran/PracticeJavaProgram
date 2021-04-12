package Tryone;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindtheduplicatecharactersinString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scan.nextLine();
		string = string.toUpperCase();
		string = string.replace(" ", "");

		char c[] = string.toCharArray();
		int size = c.length;
		String temp = "";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			if (!map.containsKey(c[i])) {
				map.put(c[i], 1);
			} else {
				int Old = map.get(c[i]);
				int NewV = Old + 1;
				map.put(c[i], NewV);
			}
		}
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			if (data.getValue() > 1) {
				temp += data.getKey();

			}
		}

		System.out.println("The duplicate characters are : " + temp);
	}
}

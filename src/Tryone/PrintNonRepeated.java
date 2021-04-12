package Tryone;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintNonRepeated {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check the non repeated characters");
		String string = scan.nextLine();
		string = string.replace(" ", "");
		char c[] = string.toCharArray();
		int size = c.length;
		String trmp ="";
		Map<Character,Integer> hmap = new LinkedHashMap<>();

		for (int i = 0; i < size; i++) {
			if(hmap.containsKey(c[i])==false) {
				hmap.put(c[i],1);
			}else {
				int oldVal = hmap.get(c[i]);
				int NewVal = oldVal+1;
				hmap.put(c[i], NewVal);
			}
		}
		for(Entry<Character,Integer> data : hmap.entrySet()){
			if(data.getValue() ==1) {
					trmp+=data.getKey();
			} else {
				trmp=null;
				System.out.println("The Non repeated characters are "+trmp);
				System.exit(0);
			}
		}
		
	}
}

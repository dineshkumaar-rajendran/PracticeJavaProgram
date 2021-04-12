package Tryone;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CheckforUniqueCharcacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to Convert ");
		String Original = scan.nextLine();
		Original = Original.replace(" ", "");
		Original = Original.toUpperCase();
		scan.close();
		char c[] = Original.toCharArray();
		int minval=0;
		String temp = "";
		
		Map<Character, Integer> hmap = new HashMap<>();
		
		for(int i = 0;i<Original.length();i++) {
			if(hmap.containsKey(c[i])==false) {
				hmap.put(c[i], 1);
			}else {
				int oldVal = hmap.get(c[i]);
				int newVal = oldVal+1;
				hmap.put(c[i],newVal);
			}
		}
		
		for(Entry<Character,Integer> data : hmap.entrySet()) {
			if(data.getValue()>1) {
				System.out.println("The Input string have duplicate characters " );
				System.exit(0);
			}
		}
		System.out.println("The Input string dont have duplicate characters");
	}
}

package assignments.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		String strName = "babu";

		char[] chars = strName.toCharArray();

		Set<Character> unique = new HashSet<Character>();

		for (int i = 0; i < chars.length; i++) {
			
			if(!unique.add(chars[i])) {
				unique.remove(chars[i]);
			}
		}
		System.out.println(unique);	
	}
}
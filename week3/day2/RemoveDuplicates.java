package assignments.week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] splitString = text.split(" ");
		
		int count = 0;
		
		StringBuffer stringWithoutDuplicates = new StringBuffer();
		
		//To remove duplicates 
		LinkedHashSet<String> lhSetWords = new LinkedHashSet<String>(Arrays.asList(splitString));
		
		for (String string : lhSetWords)
		{
			if (count > 0) 
			{
				stringWithoutDuplicates.append(" ");
			}
			stringWithoutDuplicates.append(string);
			count++;
		}
		System.out.println("After removing duplicate -> " + stringWithoutDuplicates.toString());
	}
}
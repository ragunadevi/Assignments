package assignments.week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		int[] lstSecond = {3,2,11,4,6,7};
		
		Arrays.sort(lstSecond);		
		
		int size = lstSecond.length;
		
		System.out.println("The second largest number is "+ lstSecond[size-2]);
	}
}

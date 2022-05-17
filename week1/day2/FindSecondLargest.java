package assignments.week1.day2;

import java.util.Arrays;

public class FindSecondLargest
{
	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7};
		
		int length = data.length;
		
		Arrays.sort(data);
		
		System.out.println("2nd element from last is " + data[length - 2]);
		
		for (int i = 0; i < length; i++) 
		{
			System.out.println(data[i]);
		}
	}
}
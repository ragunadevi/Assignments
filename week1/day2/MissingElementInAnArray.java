package assignments.week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray 
{
	public static void main(String[] args) 
	{
		int[] values = {1,2,3,4,7,6,8} ;
		
		Arrays.sort(values) ;
		
		for (int i = 0; i < values.length; i++) 
		{
			System.out.println("Value of I is " + i);
			
			System.out.println("Value is outside if loop " + values[i]);
			
			if( i  != values[i])
			{
				System.out.println("Value is " + values[i]);
				
				break ;
			}
		}
	}

}

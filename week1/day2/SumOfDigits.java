package assignments.week1.day2;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int input = 153;
		int original, remaining, calculated = 0;
		original = input ;
		
		while(input > 0)
		{
			remaining = input % 10;
			calculated = calculated + remaining*remaining*remaining;
			input = input / 10;
		}
		if(original == calculated)
		{
			System.out.println(original + " is a ArmStrong Number" );
		}
		else
		{
			System.out.println(original + " is not a ArmStrong Number" );
		}
	}

}

package assignments.week1.day2;

public class MyCalculator 
{
	public static void main(String[] args) 
	{
		Calculator calculator = new Calculator() ;
		System.out.println("Addition: " + calculator.add(20, 12, 30)) ;
		System.out.println("Subtraction: " + calculator.sub(40, 12)) ;
		System.out.println("Multiplication: " + calculator.multiply(20, 45)) ;
		System.out.println("Division: " + calculator.divide(100, 3)) ;
	}
}

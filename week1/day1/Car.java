package assignments.week1.day1;

public class Car {

	// Variables
	short maxSpeed = 140;
	byte seatingCapacity = 4;
	int price = 800000;
	long ownerMobile = 9876543210L;

	float mileage = 20.5f;
	double distanceCovered = 142623.356;
	char fuelType = 'D';
	boolean isPetrolEngine = false;

	public void applyBrake() 
	{
		System.out.println("Apply Brake");
	}
	
	public void applyGear() 
	{
		System.out.println("Apply Gear");
	}
	
	public void switchOnAC() 
	{
		System.out.println("Switch on AC");
	}
	
	public void applyAccelerate() 
	{
		System.out.println("Apply accelerator");
	}

	// special method - main method
	public static void main(String[] args) 
	{
		System.out.println("Inside Main Method");
		// Create an object
		Car myCar = new Car();
		myCar.applyBrake();
		myCar.applyGear();
		myCar.switchOnAC();
		myCar.applyAccelerate();
	}
}

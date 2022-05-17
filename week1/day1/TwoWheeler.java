package assignments.week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 123456678900L;
	boolean isPunctured = false ;
	String bikeName = "Unicorn";
	double runningKM = 11000.10 ;

	public static void main(String[] args) 
	{
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.noOfWheels = 5;
		
		System.out.println("First Object " + twoWheeler.noOfWheels);
		System.out.println("First Object " + twoWheeler.noOfMirrors);
		System.out.println("First Object " + twoWheeler.chassisNumber);
		System.out.println("First Object " + twoWheeler.isPunctured);
		System.out.println("First Object " + twoWheeler.bikeName);
		System.out.println("First Object " + twoWheeler.runningKM);
		
		TwoWheeler twoWheeler2 = new TwoWheeler();
		
		System.out.println("Second Object " + twoWheeler2.noOfWheels);
		System.out.println("Second Object " + twoWheeler2.noOfMirrors);
		System.out.println("Second Object " + twoWheeler2.chassisNumber);
		System.out.println("Second Object " + twoWheeler2.isPunctured);
		System.out.println("Second Object " + twoWheeler2.bikeName);
		System.out.println("Second Object " + twoWheeler2.runningKM);
	}
}

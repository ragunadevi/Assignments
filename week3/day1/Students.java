package assignments.week3.day1;

public class Students {

	public void getStudentInfo(int id) 
	{
		System.out.println("The id is "+ id);
	}
	
	public void getStudentInfo(int id, String name) 
	{
		System.out.println("The name is "+ name +" and the id is "+ id );
	}
	
	public void getStudentInfo(String email, String phoneNumber) 
	{
		System.out.println("The email is "+ email + " and the phone number is "+ phoneNumber);
	}
	public static void main(String[] args) 
	{
		Students objStud = new Students();
		objStud.getStudentInfo(2001);
		objStud.getStudentInfo(2001,"ABC");
		objStud.getStudentInfo("test@gmail.com","9999999999");
	}
	
}
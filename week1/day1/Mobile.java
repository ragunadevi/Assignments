package assignments.week1.day1;

public class Mobile {
	
	public void makeCall()
	{
		System.out.println("Making call");
	}
	
	public void sendMsg()
	{
		System.out.println("Sending Message");
	}
	public static void main(String[] args)
	{
		Mobile samsung = new Mobile();
		samsung.sendMsg();
//		samsung.makeCall();
		System.out.println("Ending the call");
	}

}

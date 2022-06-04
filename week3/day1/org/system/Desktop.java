package assignments.week3.day1.org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Inside the desktop size method in Desktop class") ;
	}
	
	public static void main(String args[])
	{
		Desktop desktop = new Desktop();
		
		desktop.computerModel();
		desktop.desktopSize();
	}
}

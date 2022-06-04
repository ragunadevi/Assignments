package assignments.week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool{

	public void Selenium() 
	{
		System.out.println("Implementation of Selenium Method");
	}

	public void Java() {
		System.out.println("Implementation of Java Method");

	}

	@Override
	public void ruby() {
		System.out.println("Overriding the abstract method ruby");
		
	}
	
	public static void main(String[] args) 
	{
		Automation automation = new Automation();
		automation.Selenium();
		automation.Java();
		automation.ruby();
		automation.python();
	}
}

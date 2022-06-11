package assignments.week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
		//Clicking contacts tab
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
	
		//Clicking merge contact
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		// Clicking on widget of from contact
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> newWindow = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(newWindow.get(1));
		
		System.out.println("Title of the screen -> " +driver.getTitle());
		// Clicking on first row of Find Contacts
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(newWindow.get(0));
		System.out.println("Title is " + driver.getTitle());
		
		// Clicking on widget of To contact
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> toWindowHandles = driver.getWindowHandles();
		
		List<String> newToWindow = new ArrayList<String>(toWindowHandles);
		
		driver.switchTo().window(newToWindow.get(1));
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(newToWindow.get(0));
		
		// Clicking on Merge button
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
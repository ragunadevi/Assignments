package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		// Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		
		// Open the browser (chrome)
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser window
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneCountryCode")).clear();

		driver.findElement(By.name("phoneNumber")).sendKeys("9999999999");
		
		driver.findElement(By.id("ext-gen334")).click();
		
		Thread.sleep(1500);
		
		WebElement result = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		String firstResult = result.getText();
		
		System.out.println("Result is " + firstResult);
		
		result.click();

		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='id'])")).sendKeys(firstResult);

		driver.findElement(By.id("ext-gen334")).click();
		
		Thread.sleep(1500);
		
		WebElement result2 = driver.findElement(By.xpath("(//div[@class='x-paging-info'])"));
		
		String secondResult = result2.getText();
		
		if(secondResult.equalsIgnoreCase("No records to display"))
		{
			System.out.println("Very good " + secondResult);
		}
		else
		{
			System.out.println("Can try again " + secondResult);
		}
		
		Thread.sleep(1500);

		// To close the browser
		driver.close();
	}
}

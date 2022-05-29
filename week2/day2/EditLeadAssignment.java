package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment {

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

		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("Raguna");
		
		driver.findElement(By.id("ext-gen334")).click();
		
		Thread.sleep(1500);
		
		WebElement result = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		
		result.click();
		
		String strTitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		System.out.println("Title is "+ strTitle);
				
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName")); 
		
		companyName.clear();
		
		String updatedCompanyName = "New Company" ;
		
		companyName.sendKeys(updatedCompanyName);
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(1500);
		
		WebElement result2 = driver.findElement(By.id("viewLead_companyName_sp"));
		
		String secondResult = result2.getText();
		
		if(secondResult.contains(updatedCompanyName))
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

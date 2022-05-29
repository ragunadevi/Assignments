package assignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModifyLeadAssignment {

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

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raguna Devi");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		// select conference in source dropdown
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(eleSource);
		dd.selectByVisibleText("Conference");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ranjitha");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello TestLeaf");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		// select conference in source dropdown
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(stateProvince);
		stateDropdown.selectByValue("NY");

		driver.findElement(By.name("submitButton")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This data is modified");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(1500);
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);

		// To close the browser
		driver.close();
	}
}

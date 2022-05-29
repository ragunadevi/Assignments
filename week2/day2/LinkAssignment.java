package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAssignment{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Open the browser
		//ChromeDriver driver = new ChromeDriver();
		 WebDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		System.out.println("End of program");
		driver.close();
	}
}
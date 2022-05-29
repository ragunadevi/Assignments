package assignments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment 
{
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("123abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pass123");
		
		WebElement ddDate = driver.findElement(By.xpath("//select[@name='birthday_day']")); 		
		Select ddDateOption = new Select(ddDate);
		ddDateOption.selectByIndex(0);
		
		WebElement ddMonth = driver.findElement(By.xpath("//select[@name='birthday_month']")); 		
		Select ddMonthOption = new Select(ddMonth);
		ddMonthOption.selectByValue("9");
		
		WebElement ddYear = driver.findElement(By.xpath("//select[@name='birthday_year']")); 		
		Select ddYearOption = new Select(ddYear);
		ddYearOption.selectByValue("1990");
		
		//For radio button
		//driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label/following-sibling::input[@name='sex']")).click();
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[3]/label/following-sibling::input[@name='sex']")).click();
		
		WebElement ddPronoun = driver.findElement(By.xpath("//div[@id='custom_gender_container']//select")); 		
		Select ddProOption  = new Select(ddPronoun);
		ddProOption.selectByIndex(1);
			
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(1500);
		
		System.out.println("Title is "+ driver.getTitle());
		driver.close();
	}
}
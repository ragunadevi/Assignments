package assignments.week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://www.ajio.com");
		
		driver.manage().window().maximize();
		WebElement brand ;
		WebElement brandDesc ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='searchbar-view']/div/input")).sendKeys("bags");

		driver.findElement(By.xpath("//div[@class='searchbar-view']//span")).click();

		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(1000); 
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("Size of Items " + text);
		
		// Brand names
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		
		System.out.println("Brand size " + brandList.size());
		
		for(int i=0;i< brandList.size();i++) 
		{
			brand = brandList.get(i);
			System.out.println("Brand name " +brand.getText());
		}
		
		// Brand description
		List<WebElement> brandDescList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0;i< brandDescList.size();i++) 
		{
			brandDesc = brandDescList.get(i);
			System.out.println("Brand desc " +brandDesc.getText());
		}
	}
}
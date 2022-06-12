package assignments.week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		List<WebElement> elements=driver.findElements(By.xpath("//div[@id='mydiv']//li"));
		
		// Get 7 in first position
		WebElement frmEle = elements.get(6);
		WebElement toEle = elements.get(0);
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.clickAndHold(frmEle).moveToElement(toEle).release(toEle).build().perform();
		Thread.sleep(2000);
		
		// Get 6 in 2nd position
		WebElement frmEle1 = elements.get(5);
		WebElement toEle1 = elements.get(1);
		Actions builder1 = new Actions(driver);
		builder1.clickAndHold(frmEle1).moveToElement(toEle1).release(toEle1).build().perform();
		Thread.sleep(2000);
		
		// Get 5 in 3rd position
		WebElement frmEle2 = elements.get(4);
		WebElement toEle2 = elements.get(2);
		Actions builder2 = new Actions(driver);
		builder2.clickAndHold(frmEle2).moveToElement(toEle2).release(toEle2).build().perform();
	}
}
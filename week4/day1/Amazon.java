package assignments.week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Typing Oneplus 9 pro and hitting ENTER
		WebElement search = driver.findElement(By.xpath("//div[@class='nav-search-field ']/input"));
		search.sendKeys("oneplus 9 pro");
		search.sendKeys(Keys.ENTER);
		
		// Getting the price of the first product
		WebElement wbPrice = driver.findElement(By.xpath("(//span[@class='a-price']/span/following-sibling::span/span[2])[1]"));
		String price = 	wbPrice.getText();
		System.out.println("Price of the product -> " + price);

		// Printing the number of customer ratings of the first product
		String customerRating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]")).getText();
		System.out.println("Customer Rating of the product -> " + customerRating);
		
		// Clicking on the first text link of the product
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		
		// Taking a screen shot of the product
		Set<String> setSubTotal = driver.getWindowHandles();
		List<String> lstSubTotal = new ArrayList<String>(setSubTotal);
		driver.switchTo().window(lstSubTotal.get(1));
		
		File productSource = driver.getScreenshotAs(OutputType.FILE);
		File productDest = new File("./screenshot.png");
		FileUtils.copyFile(productSource, productDest);
		System.out.println("Clicked the screenshot");
		
		// Clicking on Add to cart button.
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		
		WebElement subTotalElement = driver.findElement(By.xpath("//span[contains(@id, 'attach-accessory-cart-subtotal')]"));
		String subTotal = subTotalElement.getText();
		
		// Checking if the totals are same.
		if (price.contains(subTotal))
		{
			System.out.println("Values are same -> Product Price -> " + price + " and Cart Price ->" + subTotal);
		}
		else
		{
			System.out.println("Values are different -> Product Price -> " + price + " and Cart Price ->" + subTotal);
		}
		driver.close();
	}
}

package assignments.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		// Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		// Click L'Oreal Paris
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click() ;
		
		// Check the title contains L'Oreal Paris(Hint-GetTitle)
		System.out.println("The title is: " + driver.getTitle());
		Thread.sleep(2000);
		
		// Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'top rated')]")).click();
		Thread.sleep(2000);
		
		// Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		Thread.sleep(2000);
		
		// Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
		
		// Check whether the Filter is applied with Shampoo
		String shampooText = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).getText();
		if(shampooText.contains("Shampoo"))
		{
			System.out.println("Filter is applied with Shampoo");
		}
		else
		{
			System.out.println("Filter is not applied with Shampoo");
		}
		Thread.sleep(2000);
		
		// Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
	
		//	Go to the new window and select size as 175ml
		Set<String> windowHandles= driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dd = new Select(size);
		dd.selectByVisibleText("175ml");
		Thread.sleep(2000);
		
		// Print the MRP of the product
		WebElement price = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
		System.out.println("The MRP of the product is : "+ price.getText().substring(1));
		
		// Click on ADD to BAG
		driver.findElement(By.xpath("//span[contains(text(),'Add to Bag')]")).click();
		
		// Go to Shopping Bag 
		driver.findElement(By.xpath("//span[contains(text(),'Account')]/following::button[1]")).click();
		Thread.sleep(2000);
		
		// Inside frame1
		driver.findElement(By.xpath("//iframe[@class='css-acpm4k']")).click();
		driver.switchTo().frame(0);
		
		//	Print the Grand Total amount
		WebElement grandTotal = driver.findElement(By.xpath("//div[@class='value medium-strong']"));
		String grandTotalString = grandTotal.getText().substring(1);
		System.out.println("Grand total is: "+ grandTotalString);
		
		// Click Proceed
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		
		// New window
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		List<String> newWindow1 = new ArrayList<String>(windowHandles1);
//		driver.switchTo().window(newWindow1.get(1));
	
		// Click on Continue as Guest
		driver.findElement(By.xpath("//button[contains(text(),'GUEST')]")).click();
		
		// Check if this grand total is the same in step 14
		WebElement grandTotalCompare = driver.findElement(By.xpath("(//div[@class='value'])[2]"));
		String grandTotalCompareString = grandTotalCompare.getText().substring(1);
		System.out.println("Other Grand total: "+ grandTotalCompareString);
	
		if(grandTotalCompareString.equals(grandTotalString))
		{
			System.out.println("Grand total is same as above");
		}
		else
		{
			System.out.println("Grand total is not equal");
		}
		driver.close();
	}	
}
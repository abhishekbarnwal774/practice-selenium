package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class example2and3 {
	public static void main(String [] args) throws InterruptedException {
		 
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317295\\eclipse-workspace\\Selenium_practice\\Browser\\msedgedriver.exe");
	 
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/"); 
//	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    System.out.println("title of web page"+ driver.getTitle());
		driver.get("https://www.roboform.com/filling-test-all-fields");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement month = driver.findElement(By.name("66mm"));
		Thread.sleep(3000);
		// Select selMonth = new Select(month);
		// selMonth.selectByIndex(2);
		//
		// Thread.sleep(3000);
		// selMonth.selectByIndex(5);
		//
		// Thread.sleep(3000);
		// selMonth.selectByVisibleText("Aug");
		// Thread.sleep(3000);
		// selMonth.selectByValue("11");
		//
		// System.out.println("Selected value in list is .. " + selMonth.getFirstSelectedOption().getText());
		month.click();
		month.sendKeys("Jun");
		month.click();
		
	
	}
}

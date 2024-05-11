package Trutime;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CASProject {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://be.cognizant.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='O365_MainLink_MePhoto']")).click();
//		WebElement button= driver.findElement(By.xpath("//div[@id='O365_MainLink_MePhoto']"));
//		
//		Actions actions = new Actions(driver);
//        actions.moveToElement(button).click().perform();
 
        Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("mectrl_currentAccount_primary")).getText());
		System.out.println(driver.findElement(By.id("mectrl_currentAccount_secondary")).getText());
		
		driver.findElement(By.xpath("//div[@title='OneCognizant']")).click();
		
//		Thread.sleep(7000);
		

		
		//driver.findElement(By.xpath("//li[@class='searchTopBar']")).click();
		
//		driver.findElement(By.xpath("//input[@id='oneC_searchAutoComplete']")).click();
//		driver.findElement(By.xpath("//input[@id='oneC_searchAutoComplete']")).sendKeys("Tru");
		
	}

}

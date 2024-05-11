package WorldClock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clock1 {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to URL
		driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
		
		System.out.println(driver.findElement(By.id("webPartTitleReadMode")).getText());
		
		
	}

}

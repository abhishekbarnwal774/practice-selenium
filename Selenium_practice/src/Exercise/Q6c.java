package Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Q6c {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\2317295\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Selenium_practice\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Browser\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form"); 
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     System.out.println("Title of web page"+ driver.getTitle());
	     WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()=\"Reading\"]"));
	     checkbox.click();
	     Thread.sleep(3000);
	     checkbox.click();
	     System.out.println(checkbox.getText());
	}
 
}

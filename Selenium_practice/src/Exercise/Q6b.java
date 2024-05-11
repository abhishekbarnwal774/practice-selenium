package Exercise;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Q6b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\2317295\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Selenium_practice\\\\\\\\\\\\\\\\Browser\\\\\\\\\\\\\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button"); 
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     System.out.println("Title of web page"+ driver.getTitle());
	     WebElement RadioButton =driver.findElement(By.xpath("//label[normalize-space()=\"Yes\"]"));
	     RadioButton.click();
	     RadioButton.isDisplayed();
	     RadioButton.isEnabled();
	     System.out.println(RadioButton.getText());

	}
 
}

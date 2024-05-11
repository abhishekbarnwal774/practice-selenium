package Exercise;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Q5 {
	public static void main(String [] args) {
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form"); 
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     System.out.println("Title of web page"+ driver.getTitle());
	     WebElement email = driver.findElement(By.id("userEmail"));
	     email.sendKeys("abhishek@gmail.com");
	     String emailValue = KeyInput("abhishek@gmail.com");
	     System.out.println("Email id: " + emailValue);
	     WebElement first = driver.findElement(By.id("firstName"));
	     first.sendKeys("Abhishek");
	     String firstValue = KeyInput("Abhishek");
	     System.out.println("First Name: " + firstValue);
	     WebElement last = driver.findElement(By.id("lastName"));
	     last.sendKeys("Barnwal");
	     String lastValue = KeyInput("Barnwal");
	     System.out.println("Last Name: " + lastValue);

	     WebElement number = driver.findElement(By.id("userNumber"));
	     number.sendKeys("9064215195");
	     String numberValue = KeyInput("9064215195");
	     System.out.println("Mobile Number: " + numberValue);

	     WebElement address = driver.findElement(By.id("currentAddress"));
	     address.sendKeys("Shollinganalur");
	     String addressValue = KeyInput("Shollinganalur");
	     System.out.println("Current Address: " + addressValue);
	    WebElement RadioButton =driver.findElement(By.xpath("//label[normalize-space()=\"Male\"]"));
	     RadioButton.click();
	     RadioButton.isDisplayed();
	     RadioButton.isEnabled();
	     System.out.println(RadioButton.getText()); 
	     }
	   
	private static String KeyInput(String string) {
		// TODO Auto-generated method stub
		return string;
	}
}
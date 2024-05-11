package Exercise;


import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Q6a {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\\\\\\\Users\\\\\\\\2317295\\\\\\\\eclipse-workspace\\\\\\\\Selenium_practice\\\\\\\\Browser\\\\\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box"); 
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     System.out.println("Title of web page"+ driver.getTitle());
	     WebElement email = driver.findElement(By.id("userEmail"));
	     email.sendKeys("abhishekbarnwal@gmail.com");
	     String emailValue = KeyInput("abhishekbarnwal@gmail.com");
	     System.out.println("Email id: " + emailValue);
	     WebElement first = driver.findElement(By.id("userName"));
	     first.sendKeys("Abhishek Barnwal");
	     String firstValue = KeyInput("Abhishek Barnwal");
	     System.out.println("First Name: " + firstValue);
	     WebElement address = driver.findElement(By.id("currentAddress"));
	     address.sendKeys("Shollinganalur");
	     String addressValue = KeyInput("Shollinganalur ");
	     System.out.println("Current Address: " + addressValue);
	     WebElement permanent = driver.findElement(By.id("permanentAddress"));
	     permanent.sendKeys("West Bengal");
	     String permanentValue = KeyInput("West Bengal ");
	     System.out.println("Current Address: " + permanentValue);

 
	}
 
	private static String KeyInput(String string) {
		// TODO Auto-generated method stub
		return string;
	}
 
}
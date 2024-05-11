package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Q1 {
	public static void main(String [] args){
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Accessing element by IDs
		WebElement emailField = driver.findElement(By.id("email"));
        System.out.println("Tag name of emailField: " + emailField.getTagName());
        System.out.println("Placeholder attribute of emailField: " + emailField.getAttribute("placeholder"));
        emailField.sendKeys("abc@gmail.com");

        // Accessing element by Name
        WebElement passwordField = driver.findElement(By.name("pass"));
        System.out.println("Tag name of passwordField: " + passwordField.getTagName());
        System.out.println("Type attribute of passwordField: " + passwordField.getAttribute("type"));
        passwordField.sendKeys("Abhi@123");
        
       // driver.close();
	
	}
}
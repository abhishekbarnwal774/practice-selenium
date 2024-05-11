package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title of the Webpage : " + driver.getTitle());
		// WebElement email = driver.findElement(By.id("email"));
		// email.sendKeys("abc@gmail.com");
		//
		// WebElement login = driver.findElement(By.name("login"));
		// login.click();
		// WebElement forgotPwd = 
		driver.findElement(By.linkText("Forgotten password?"));
		WebElement forgotPwd = driver.findElement(By.partialLinkText("Forgotten"));
		forgotPwd.click();
}
	}

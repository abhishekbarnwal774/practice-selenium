package Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2 {
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title of the Webpage : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title of the Webpage : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().to("https://partnerportal.udemy.com/user/login/");
		System.out.println("Title of the Webpage : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println("Current URL : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println("Current URL : " + driver.getCurrentUrl());
	
	
	}
}

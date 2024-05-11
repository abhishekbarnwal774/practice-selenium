package Mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Enquiry_of_building_project {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://ishahomes.com/completed-projects/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("eicon-close")).click();
		driver.findElement(By.id("livchat_close")).click();
		driver.findElement(By.className("close-indicator")).click();
		driver.findElement(By.xpath("//li[@id='menu-item-25810']/a")).click();
		driver.findElement(By.className("eicon-close")).click();
		driver.findElement(By.className("close-indicator")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println(driver.findElements(By.className("isha_project_details")).size());
		int cnt=0;
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='isha_project_details']//div//div//h2//a"));
		for(WebElement l: lst) {
			if(cnt==5) {
				break;
			}
			System.out.println(l.getText());
			cnt++;
		}
		js.executeScript("window.scrollBy(0,2000)");
		driver.findElement(By.className("enq-tooltip-new")).click();
		driver.findElement(By.xpath("//a[@href='#other-pop']/span[2]")).click();
		System.out.println(driver.findElement(By.xpath("//a[@href='mail:marketing@ishahomes.com']")).getText());
		driver.quit();
    }
}

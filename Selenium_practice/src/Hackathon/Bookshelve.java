package Hackathon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Bookshelve {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigate to URL
		driver.get("https://www.urbanladder.com/");

		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Bookshelve");

		driver.findElement(By.cssSelector("div[class='tt-suggestion tt-selectable'] strong")).click();

		driver.findElement(By.cssSelector("a[class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//li[@data-group=\"price\"]")).click();
		driver.findElement(By.xpath("//input[@name='filters[availability][]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-group='sorting']")).click();
		driver.findElement(By.xpath("//li[@data-key='price_asc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li[class='topnav_item storagefurnitureunit']")).click();
		

		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='price-number']/span"));
		int c = 0;
		for (WebElement wb : lst) {
			if (c < 3) {
				System.out.println(wb.getText());
				c++;
			}
		}

		// driver.quit();
	}
}

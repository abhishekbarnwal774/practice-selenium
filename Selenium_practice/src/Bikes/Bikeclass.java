package Bikes;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Bikeclass {

	public static void main(String[] args) throws IOException, InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(" https://www.zigwheels.com");

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//a[text() = 'New Bikes']"))).build().perform();

		driver.findElement(By.xpath("//*[text() = 'Upcoming Bikes']")).click();

		driver.findElement(By.xpath("//select[@id = 'makeId']")).click();

		driver.findElement(By.xpath("//option[@data-url='honda']")).click();

		List<WebElement> pricelist = driver.findElements(By.cssSelector("div[class='b fnt-15']"));

		// System.out.println(pricelist.size());

		int size = pricelist.size();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1500)");

//		

		System.out.println(driver.findElement(By.xpath("//ul[@id='modelList']/li[16]/span")).getText());

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='zw-cmn-loadMore']")));

		driver.findElement(By.xpath("//span[@class='zw-cmn-loadMore']")).click();

		List<WebElement> bikes = (driver.findElements(
				By.xpath("//a[@data-track-label = 'model-name']//strong[@class = 'lnk-hvr block of-hid h-height']")));

		List<WebElement> launchDate = (driver.findElements(By.cssSelector("div[class='clr-try fnt-14']")));

		for (int i = 0; i < size; i++) {

			String[] amtList = pricelist.get(i).getText().split(" ");

			String price1 = amtList[1].replace(",", "");

			Float price = Float.parseFloat(price1);

			if (price < 4) {

				System.out.println(pricelist.get(i).getText());

				System.out.println(bikes.get(i).getText());

				System.out.println(launchDate.get(i).getText());

			}

		}

		// Login

		JavascriptExecutor j = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,-1500)");

		driver.findElement(By.xpath("//div[@id = 'des_lIcon']")).click();

		driver.findElement(By.xpath("//div[@class = 'newgf-login']//span[text() = 'Google']")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();

		String parent = it.next();

		String Child = it.next();

		driver.switchTo().window(Child);

//		WebDriverWait mywait = new WebDriverWait(driver, 10);

//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@autocomplete = 'username']")));

		System.out.println(driver.findElement(By.xpath("//h1[@class = 'vAV9bf']//span[text() = 'Sign in']")).getText());

//		

		Thread.sleep(3000);

		WebElement uname = driver.findElement(By.xpath("//input[@type = 'email']"));

		uname.click();

		uname.sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//div[@class = 'O1Slxf']//div//div//div//button[@jsname = 'LgbsSe']")).click();

		Thread.sleep(2000);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	//	FileUtils.copyFile(src, new File(
//				"C:\\Users\\2317307\\OneDrive - Cognizant\\Desktop\\Eclipse-Java\\SeleniumAutomationbPractice\\Screenshot4.png"));

		driver.switchTo().window(parent);

		driver.findElement(By.xpath("//span[@class = 'close']")).click();

		JavascriptExecutor jscp = (JavascriptExecutor) driver;

		jscp.executeScript("window.scrollBy(0,-600)");
//		 driver.findElement(By.cssSelector("ul.h-d-nav")).click();

//		WebDriverWait mywait = new WebDriverWait(driver, 10);
//
//		mywait.until(ExpectedConditions.elementToBeSelected(By.xpath("(//a[@class='c-p'])[4]")));

		Actions e = new Actions(driver);

		e.moveToElement(driver.findElement(By.xpath("(//a[@class='c-p'])[4]"))).build().perform();

//		e.click();

//		// driver.findElement(By.xpath("//a[text()='Used Cars']")).click();
//
		Actions d = new Actions(driver);
//
		d.moveToElement(driver.findElement(By.xpath("//span[@data-tag-url='/used-car/Chennai']"))).build().perform();
		d.doubleClick();
		
		driver.navigate().to("https://www.zigwheels.com/used-car/Chennai");
		List<WebElement> lst= driver.findElements(By.xpath("//ul[contains(@class,'popularModels')]/li)"));
		Thread.sleep(5000);
		for(WebElement wb: lst) {
			System.out.println(wb.getText());
		}
		
		
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id =
		// 'google_ads_top_frame']")));

		// System.out.println(driver.findElement(By.xpath("//div[text() = 'Popular
		// Models']")));

	}

}

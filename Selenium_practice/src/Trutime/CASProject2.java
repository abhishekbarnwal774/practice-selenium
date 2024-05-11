package Trutime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CASProject2 {
	public static void main(String[] args) throws InterruptedException{
		
		//Format and current date from the machine
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, dd MMM");  
		 DateTimeFormatter month = DateTimeFormatter.ofPattern("MMMM");
		 LocalDateTime now = LocalDateTime.now();  
		 
		 //Driver Setup
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to URL
		driver.get("https://onecognizant.cognizant.com/Home");
		
		//Click on the Search Button and enter TruTime
		driver.findElement(By.xpath("//li[@class='searchTopBar']")).click();
		driver.findElement(By.xpath("//input[@id='oneCSearchTop']")).sendKeys("Tru Time");
		driver.findElement(By.xpath("//div[@class='appsResultText']")).click();
		
		//Change the script to work on the child frame
		driver.switchTo().frame("appFrame");
		
		//Validating the current week
		List<WebElement> results=driver.findElements(By.cssSelector("div.dayHeadr"));
		ArrayList<String> happy = new ArrayList<>();
		for(WebElement y:results) {
			happy.add( y.getText());
		}	
		for(WebElement wb: results) {
			System.out.println(wb.getText());
		}
		LocalDate currentDate = LocalDate.now();
        List<String> result2 = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            LocalDate weekDay = currentDate.minusDays(currentDate.getDayOfWeek().getValue() - i);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM", Locale.ENGLISH);
            String formattedDate = weekDay.format(formatter);
            System.out.println(formattedDate);
            result2.add(formattedDate);
        }
        System.out.println(happy.equals(result2));
        
        
		//Validate with the current Date
		String currDate=driver.findElement(By.xpath("//div[@ng-if='item.Date==activeDate']")).getText();
		
		if(currDate.equals((dtf.format(now)))){
		System.out.println("From TruTime Date: "+currDate);
		System.out.println("Current Date output: "+dtf.format(now));
		System.out.println("Congo, The Dates are matching");
		}
		else {
			 System.out.println("Dates are not matching");
		}
		
		//Validate the current Month
		String currMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		if(currMonth.equals((month.format(now)))) {
		System.out.println("You are going right, The months are matching");
		}
		else {
			System.out.println("Oops the month is not matching with the current month");
		}
		
		
		//Validate the 15 days topup date
		String topupDate=driver.findElement(By.cssSelector("span.topupavailablefromDate")).getText();
		LocalDateTime fifteenDaysBack= now.minusDays(15);
		
		if(topupDate.equals((dtf.format(fifteenDaysBack)))){
			System.out.println("Topup Date is correctly Displaying");
		}
		else {
			System.out.println("Oh no it is not matching");
		}
		
		
		//Displaying the LEGENDS
		System.out.println("Legends are given below:-");
		System.out.println(driver.findElement(By.id("legendListID")).getText());
		
		//Closing the browser
		driver.quit();
	}

}

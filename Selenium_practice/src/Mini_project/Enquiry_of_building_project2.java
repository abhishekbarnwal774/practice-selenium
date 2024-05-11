package Mini_project;


	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

public class Enquiry_of_building_project2 {
		public static void main(String[] args) throws	InterruptedException  {

			System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\2317295\\\\eclipse-workspace\\\\Selenium_practice\\\\Browser\\\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://ishahomes.com/completed-projects/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//			WebDriverWait winWait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			WebDriverWait winWait = new WebDriverWait(driver,30);
			// Handling pop and live Chat
			try {
				winWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='livprop_popup1']")));
				Thread.sleep(3000);		
				WebElement chat = 	driver.findElement(By.xpath("//a[@id='livchat_close']"));
				
				 if (chat.isDisplayed()) {
					 chat.click();
				 }else {
					 System.out.println("Live Chat didn't Appeared");
				 }
			}catch(Exception e) {
				
			}
			//*[@id='elementor-popup-modal-31892']
			try {
			winWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='elementor-popup-modal-33100']")));
				Thread.sleep(3000);		
				WebElement popUp = 	driver.findElement(By.xpath("//*[@id='elementor-popup-modal-33100']/div/a"));
				 if (popUp.isDisplayed()) {
					 popUp.click();
				 }else {
					 System.out.println("Pop up didn't Appeared");
				 }
			}catch(Exception e) {

			}
			// navigate to completed projects
			driver.navigate().to("https://ishahomes.com/completed-projects/");
			// Count total number of completed projects
	        int totalProjects = driver.findElements(By.xpath("//h2[@class='item-title']/a")).size();
	        System.out.println("Total completed projects: " + totalProjects);
	        // Display names of first five completed projects
	        List<WebElement> projectNames = driver.findElements(By.xpath("//h2[@class='item-title']/a"));
	        System.out.println("Completed Projects are:");
	        for (int i = 0; i <5; i++) {
	            System.out.println(i+1 +". " + projectNames.get(i).getText());
	        }
	        //Scroll down
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,600)");
	        //  click on "Enquire Now" button
//	        driver.findElement(By.xpath("//div[@class='mci-ph enq-tooltip-new']/a")).click();
//	        driver.findElement(By.xpath("//a[@href='#joint-pop']")).click();
//	        String EmailAddress = driver.findElement(By.xpath("//*[text()='land@ishahomes.com']")).getText();
//	        System.out.println("Email Address:"+EmailAddress);
	        driver.findElement(By.className("enq-tooltip-new")).click();
			driver.findElement(By.xpath("//a[@href='#other-pop']/span[2]")).click();
			System.out.println(driver.findElement(By.xpath("//a[@href='mail:marketing@ishahomes.com']")).getText());
//		
	        //*[@data-id='6d29e293'] 
	        
	        // Verify if "Contact Info" text is displayed
	        try {
	        boolean contactInfoText = driver.findElement(By.xpath("//*[contains(text(), 'Contact Info')]")).isDisplayed();
	        if (contactInfoText) {
	            System.out.println("Contact Info text is displayed.");
	        } else {
	            System.out.println("Contact Info text is not displayed.");
	        }
	        }catch(Exception e) {

	        }
	        driver.close();
		}
	 
	}


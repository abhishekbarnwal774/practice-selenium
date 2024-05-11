package Exercise;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Q4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\2317295\\eclipse-workspace\\Selenium_practice\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.roboform.com/filling-test-all-fields"); 
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement month = driver.findElement(By.name("66mm"));
	    Select selMonth = new Select(month);
	    //selMonth.selectByIndex(2);
	 //   Thread.sleep(3000);
	 //   selMonth.selectByIndex(5);
	 //   Thread.sleep(3000);
	  //  selMonth.selectByVisibleText("Aug");
	    Thread.sleep(3000);
	    selMonth.selectByValue("11");
	    System.out.println("Selected value of month in list is.." + selMonth.getFirstSelectedOption().getText());

	    WebElement day = driver.findElement(By.name("67dd"));
	    Select selday = new Select(day);
	    selday.selectByIndex(5);
	    System.out.println("Selected value of day in list is.." + selday.getFirstSelectedOption().getText());
	    WebElement Year = driver.findElement(By.name("68yy"));
	    Select selYear = new Select(Year);
	    selYear.selectByValue("1989");
	    System.out.println("Selected value of year in list is.." + selYear.getFirstSelectedOption().getText());

	    WebElement type = driver.findElement(By.name("40cc__type"));
	    Select seltype = new Select(type);
	    seltype.selectByIndex(3);
	    System.out.println("Selected value of card type in list is.." + seltype.getFirstSelectedOption().getText());

	    WebElement month1 = driver.findElement(By.name("42ccexp_mm"));
	    Select setmonth = new Select(month1);
	    selMonth.selectByValue("6");
	    System.out.println("Selected value of Expiration month in list is.." + selMonth.getFirstSelectedOption().getText());
	    WebElement year = driver.findElement(By.name("43ccexp_yy"));
	    Select setyear = new Select(year);
	    selYear.selectByValue("2030");
	    System.out.println("Selected value of Expiration year  in list is.." + selYear.getFirstSelectedOption().getText());

 
	    WebElement first = driver.findElement(By.name("02frstname"));
	     first.sendKeys("Abhishek ");
	     String firstValue = KeyInput("Abhishek ");
	     System.out.println("First Name: " + firstValue);
	     WebElement last = driver.findElement(By.name("04lastname"));
	     last.sendKeys("Barnwal ");
	     String lastValue = KeyInput("Barnwal ");
	     System.out.println("Last Name: " + lastValue);
	     WebElement fullname = driver.findElement(By.name("04fullname"));
	     fullname.sendKeys("Abhishek Barnwal ");
	     String fullnameValue = KeyInput("Abhishek Barnwal ");
	     System.out.println("Full Name: " + fullnameValue);
	     WebElement company = driver.findElement(By.name("05_company"));
	     company.sendKeys("Cognizant");
	     String companyValue = KeyInput("Cognizant ");
	     System.out.println("Company Name: " + companyValue);
	     WebElement position = driver.findElement(By.name("06position"));
	     position.sendKeys("PAT");
	     String positionValue = KeyInput("PAT");
	     System.out.println("Position: " + positionValue);
	     WebElement address = driver.findElement(By.name("10address1"));
	     address.sendKeys("West Bengal");
	     String addressValue = KeyInput("West Bengal");
	     System.out.println("Address: " + addressValue);
	     WebElement city = driver.findElement(By.name("13adr_city"));
	     city.sendKeys("Asansol");
	     String cityValue = KeyInput("Asansol");
	     System.out.println("City: " + cityValue);

 
	     WebElement state = driver.findElement(By.name("14adrstate"));
	     state.sendKeys("West Bengal");
	     String stateValue = KeyInput("West Bengal");
	     System.out.println("State: " + stateValue);

 
	     WebElement country = driver.findElement(By.name("15_country"));
	     country.sendKeys("India");
	     String countryValue = KeyInput("India");
	     System.out.println("Country: " + countryValue);
	     WebElement zip = driver.findElement(By.name("16addr_zip"));
	     zip.sendKeys("713346");
	     String zipValue = KeyInput("713346");
	     System.out.println("Zip: " + zipValue);
	     WebElement phone = driver.findElement(By.name("20homephon"));
	     phone.sendKeys("9064215195");
	     String phoneValue = KeyInput("9064215195");
	     System.out.println("Phone: " + phoneValue);
	     WebElement work = driver.findElement(By.name("21workphon"));
	     work.sendKeys("9064215195");
	     String workValue = KeyInput("9064215195");
	     System.out.println("Work Phone: " + workValue);
	     WebElement fax = driver.findElement(By.name("22faxphone"));
	     fax.sendKeys("7307297584");
	     String faxValue = KeyInput("7307297584");
	     System.out.println("Fax: " + faxValue);
	     WebElement email = driver.findElement(By.name("24emailadr"));
	     email.sendKeys("abhishekbarnwal@gmail");
	     String emailValue = KeyInput("abhishekbarnwal@gmail");
	     System.out.println("Email: " + emailValue);
	     WebElement website = driver.findElement(By.name("25web_site"));
	     website.sendKeys("abhishekbarnwal@gmail");
	     String websiteValue = KeyInput("abhishekbarnwal@gmail");
	     System.out.println("Website: " + websiteValue);
	     WebElement user = driver.findElement(By.name("30_user_id"));
	     user.sendKeys("77777");
	     String userValue = KeyInput("77777");
	     System.out.println("UserId: " + userValue);
	     WebElement password = driver.findElement(By.name("31password"));
	     password.sendKeys("77777");
	     String passwordValue = KeyInput("77777");
	     System.out.println("Password: " + passwordValue);
	     WebElement card = driver.findElement(By.name("41ccnumber"));
	     card.sendKeys("77777");
	     String cardValue = KeyInput("77777");
	     System.out.println("Card Number: " + cardValue);
	     WebElement cardcode = driver.findElement(By.name("43cvc"));
	     cardcode.sendKeys("77777");
	     String cardcodeValue = KeyInput("77777");
	     System.out.println("Card verification code: " + cardcodeValue);
	     WebElement username = driver.findElement(By.name("44cc_uname"));
	     username.sendKeys("abhishek");
	     String usernameValue = KeyInput("abhishek");
	     System.out.println("Card User name: " + usernameValue);
	     WebElement bank = driver.findElement(By.name("45ccissuer"));
	     bank.sendKeys("Axis");
	     String bankValue = KeyInput("Axis");
	     System.out.println("Bank: " + bankValue);
	     WebElement service = driver.findElement(By.name("46cccstsvc"));
	     service.sendKeys("098765432");
	     String serviceValue = KeyInput("098765432");
	     System.out.println("Card service phone: " + serviceValue);
	     WebElement sex = driver.findElement(By.name("60pers_sex"));
	     sex.sendKeys("Male");
	     String sexValue = KeyInput("Male");
	     System.out.println("Sex: " + sexValue);
	     WebElement security = driver.findElement(By.name("61pers_ssn"));
	     security.sendKeys("33333");
	     String securityValue = KeyInput("33333");
	     System.out.println("Security Number: " + securityValue);
	     WebElement drivernumber = driver.findElement(By.name("62driv_lic"));
	     drivernumber.sendKeys("12345");
	     String drivernumberValue = KeyInput("12345");
	     System.out.println("Driver licence: " + drivernumberValue);
	     WebElement age = driver.findElement(By.name("66pers_age"));
	     age.sendKeys("22");
	     String ageValue = KeyInput("22");
	     System.out.println("Age: " + ageValue);
	     WebElement birth = driver.findElement(By.name("67birth_pl"));
	     birth.sendKeys("Asansol");
	     String birthValue = KeyInput("Asansol");
	     System.out.println("Birth Place: " + birthValue);
	     WebElement income = driver.findElement(By.name("68__income"));
	     income.sendKeys("33,000");
	     String incomeValue = KeyInput("33.000");
	     System.out.println("Income: " + incomeValue);
	     WebElement message = driver.findElement(By.name("71__custom"));
	     message.sendKeys("Selenium");
	     String messageValue = KeyInput("Selenium");
	     System.out.println(" Custom Message: " + messageValue);
	     WebElement comment = driver.findElement(By.name("72__commnt"));
	     comment.sendKeys("Selenium");
	     String commentValue = KeyInput("Selenium");
	     System.out.println("Comment: " + commentValue);
	     
	}
 
	private static String KeyInput(String string) {
		// TODO Auto-generated method stub
		return string;
	}
 
}
package Sales.SalesForceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LoginError_TestCase_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\SalesForceProject\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("/html/body/div[1]/hgf-c360nav//header/div/div[1]/nav[2]/ul/li[5]/hgf-c360login//hgf-popover/hgf-button/span[2]")).click();
		//driver.get("https://login.salesforce.com/");
        WebElement lg =	driver.findElement(By.name("logo"));
        if (lg.isDisplayed()) {
        	
        	System.out.println("Salesforce logo is displayed = test pass");
        	
        }
        else {
        	
        	System.out.println(" Salesforce logo is not displayed = test fail");
        }
 

	WebElement usrfield =	driver.findElement(By.id("username"));
	usrfield.sendKeys("abc");
	
	if(usrfield.isDisplayed()) {
		System.out.println("username is displayed = test pass");
	}else {
		
		System.out.println("test fail");
	}
	
	
	
	
	WebElement ps = driver.findElement(By.name("pw"));
	ps.clear();
	
	ps.sendKeys("");
	
	driver.findElement(By.id("Login")).click();
		
	//WebElement error =	driver.findElement(By.className("loginError"));
		
	 
		String actual = "error 2";
	String expected = "Please enter your password.";
	if(actual.equalsIgnoreCase(expected)) {
		System.out.println(" test pass");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement log = driver.findElement(By.linkText("Login"));
		 * 
		 * Actions action = new Actions(driver); action.moveToElement(log);
		 */
		
	}

}

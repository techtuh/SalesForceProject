package Sales.SalesForceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Options {

	

	public static void main(String[] args) {
		
		
	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	
		
	
	}
	  
	 
	}
		
	
	



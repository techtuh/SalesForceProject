package Sales.SalesForceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Options {

	

	public static void main(String[] args) {
		
		
		WebDriver driver;
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		 driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		/*
		 * String ActualTitle = driver.getTitle(); String ExpectedTitle = "google";
		 * //Assert.assertEquals(ExpectedTitle, ActualTitle);*/
		 System.out.println(driver.getTitle());
		
		
			
			  System.out.println("Im working on github"); System.out.println("about me");
			  
			  ChromeOptions opti = new ChromeOptions(); opti.addArguments("--headless");
			  driver.get("https://www.amazon.com"); driver.getTitle();
			  
			  System.out.println(driver.getTitle());
			 
	
	}
	  
	 
	}
		
	
	



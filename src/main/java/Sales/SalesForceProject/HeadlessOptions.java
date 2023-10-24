package Sales.SalesForceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessOptions {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.ebay.com");
		System.out.println(driver.getTitle());
		
		String actual = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expected = driver.getTitle();
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
	}
}

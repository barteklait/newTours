package pl.lait.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/DELL/Desktop/CHROMEDRIVER AKTUALNY/chromedriver.exe");
		System.out.println("Hello zxfcWorld! odpalamy chroma");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		return driver;
	}
	
}

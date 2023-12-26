package Parallel_testing_with_vrushali;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_vrushi {

	WebDriver driver;
	
	@Test
	public void setUp() {

		System.setProperty("webdriver.chrom.driver","chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.Facebook.com/");
		
		
		
	}
	
}

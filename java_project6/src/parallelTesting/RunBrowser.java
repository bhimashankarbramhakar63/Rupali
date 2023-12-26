package parallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunBrowser {
	@Test
	public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://Amezon.com");
		
	}
	
	@Test
	public void chromeBrowser2() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://Facebook.com");
	}	
	@Test
	public void chromeBrowser3() {
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://Google.com");
	}

}

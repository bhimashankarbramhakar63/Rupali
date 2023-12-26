package Orange_HRM_Login_Testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pom_Classes.Normal_HRM;

public class Performe_HRM_Test {
	
	
	WebDriver driver = null; 
	
	@Test
	public void perform_test() throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				
	
		
		Thread.sleep(3000);
		
		Normal_HRM shrikant =  PageFactory.initElements(driver, Normal_HRM.class);
		shrikant.loginapp("Admin", "Qedge123!@#");
				
	}
}

package Action_Clas.javascriptexecutershridharrr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample7 {
	
	public static void main (String[]args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://snapdeal.com");	
		
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("kuyfytfyjtfyjtfjytfkt"))).click();
		act.build().perform();
		
		driver.quit();
	}

}

package Action_Clas.javascriptexecutershridharrr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://snapdeal.com");	
	
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Electronics")));
		act.contextClick();
		act.build().perform();
		
	}

}

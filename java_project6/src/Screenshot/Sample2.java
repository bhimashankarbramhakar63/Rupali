package Screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main (String[]args) {
				
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://snapdeal.com");
		
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	   File destination = new File("hhfykff");
	   
	    
	}

}

package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample1 {
	
	private static final String FileUtils = null;

	public static void main(String[] args) throws  InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
	//	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	//	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	//	driver.findElement(By.id("login")).click();
		
	//	driver.findElement(By.xpath("//img[@src='images/admin_but_02.jpg']")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\lenovo\\eclipse-workspace\\java_project\\Screenshot.txt");
		
	     try {
			FileHandler.copy(srcfile, destfile);
			System.out.println("Screenshot taken successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	     Thread.sleep(3000);
	     
	     driver.quit();
		
	}

}

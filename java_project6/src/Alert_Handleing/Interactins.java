package Alert_Handleing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactins {
	
		   public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		   driver.get("https://demoqa.com/");
		   
		String  title_of_the_page =  driver.getTitle();
		   
	 System.out.println("Title of the page is => " + title_of_the_page);
			
		   Thread.sleep(2000);
		   
		  String url =  driver.getCurrentUrl();
		  
		   System.out.println(" The url of the page is => " + url);
		   
		   Thread.sleep(2000);
		   
		   if(driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed()) {
			   
			   System.out.println("Correct link has been opened here successfully...");
		   }else {
			   
			   System.out.println(" Wrong url is filled , Please check the corect url ");
		   }
		 		 
		   Thread.sleep(5000);

		   driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();

		   Thread.sleep(1000);
		   
		  driver.findElement(By.xpath("(//div[@class='icon'])[1]")).click();
		   
		  Thread.sleep(1000);
			
		   driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]")).click();	
		   
		   Thread.sleep(3000);
		   
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 800)");
		
	}

}

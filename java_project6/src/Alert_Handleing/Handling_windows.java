package Alert_Handleing;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthTextAreaUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_windows {


	   public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
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
	   
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("(//span[@class='text'])[11]")).click();
	   
	   driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	   
	   Thread.sleep(1000);
	   
	 Set<String> handling_windows =  driver.getWindowHandles();
	   
	   System.out.println(handling_windows);
	   
	   
	Object[] windows_name  =   handling_windows.toArray();
	   
	   String second_window = windows_name[1].toString();
	   
	   String first_window = windows_name[0].toString();
	   
     String title_of_the_second_window	 =   driver.getTitle();
	   
	   System.out.println("Second window title => " + title_of_the_second_window);
	   
	   Thread.sleep(1000);
	   
	  driver.switchTo().window(first_window);
	  
	String title_of_the_first_window =  driver.getTitle();
	   
	   System.out.println(" first window title => " + title_of_the_first_window);
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//button[@id='windowButton']")).click(); 
	   
	   Thread.sleep(1000);
	   
	  driver.switchTo().window(first_window);
	  
	  Thread.sleep(1000);
	  
	   driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
	
	   Thread.sleep(1000);
	   
	   driver.switchTo().window(first_window);
	
	
	Thread.sleep(3000);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600)");
	   

	   Thread.sleep(3000);
	   
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")).click();
	     
	   

	
	   
	   
	   }
}

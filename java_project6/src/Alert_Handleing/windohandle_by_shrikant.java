package Alert_Handleing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windohandle_by_shrikant {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\gmail.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='NUwdAb']")).click();
		Thread.sleep(5000);
		
		Set<String>window=driver.getWindowHandles();
		
	  		
	/*   String handle =   driver.getWindowHandle();
	   
	  
	   
	   
	      driver.switchTo().window(handle);
	     
	      WebElement click = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/div/div/div/div[1]/ul/li[2]/a"));
        click.click();  */
	      
	}

}

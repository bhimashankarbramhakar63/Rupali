package Ankita;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GooglleOpenSample {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdruver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//li[@jsname='RZzeR']")));
		
		act.click();
		act.build().perform();
		
		driver.navigate().back();
	
		Thread.sleep(3000);
		
       driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
            
        Thread.sleep(3000); 
        
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/div/div/div[1]/div[2]/div")).click();
      
	 Thread.sleep(2000);
     Select sele = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/div/div/div[1]/div[2]/div")));

	List<WebElement>	all_langu = sele.getOptions();
	
	System.out.println(all_langu.size());
		
		for(int i = 0; i<all_langu.size(); i++) 
		{
			
		String all_bhasha =	all_langu.get(i).getText();
		System.out.println(all_bhasha);
		
		}
		
        Thread.sleep(3000);
		driver.quit();
		
      }

}

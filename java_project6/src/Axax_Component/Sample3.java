package Axax_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		WebElement key = driver.findElement(By.xpath("//*[@role='listbox']"));		
		List<WebElement> keywordlist = key.findElements(By.tagName("li"));
		
		for(int i=0;i<keywordlist.size();i++)
		{
			if(keywordlist.get(i).getText().toLowerCase().contains("download"))
			{
				keywordlist.get(i).click();
				break;
			}
		}
		System.out.println("completed............................");
	}

}

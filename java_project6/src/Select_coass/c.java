package Select_coass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class c {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a[@role='button'])[2]"));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(3000);
		
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Thread.sleep(3000);
	
	Select s=new Select(year);
	s.selectByVisibleText("2019");
	
	
		
	}

}
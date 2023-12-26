package Select_coass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","chromedriver.exe ");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//inspect month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select (month);
	//	s.selectByVisibleText("May");
		
		s.selectByIndex(4);
		
		System.out.println("completed");
	}

}

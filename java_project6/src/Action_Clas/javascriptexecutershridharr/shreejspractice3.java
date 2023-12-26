package Action_Clas.javascriptexecutershridharr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shreejspractice3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("ramdoem@gmail.com");
		driver.findElement(By.xpath("//input[@id='peristent']")).click();
		
		//javascriptExecuter js =(javascriptExecutor)driver;
		//js.executeScript("alert('welcome to selenium')");
		
		
		
		
		
		
		
	}

}

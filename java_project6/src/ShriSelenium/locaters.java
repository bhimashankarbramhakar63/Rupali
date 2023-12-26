package ShriSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {

	public static void main(String[] args) {
		
		System.setProperty("webdruver.chrome.driver", "chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.amezon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirts");
		
	}

}

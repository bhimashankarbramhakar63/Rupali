
package ShriSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver.exe","chromedriver.exe");	
		
		ChromeDriver driver	= new ChromeDriver();

		driver.get("https://www.amezon.in/");
		driver.findElement(By.id(" twotabsearchtextbox")).sendKeys("joggers");

	}

}

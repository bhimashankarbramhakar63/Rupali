package Flipcard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException  {

		// Here we are just set the chromdriver path

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		// we are opening the browser

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		// filling  the url

		driver.get("https://www.flipkart.com/");

		// finding the elements present on that webpages 

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("mobiles");
		Thread.sleep(2000);

		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);

		String prize=driver.findElement(By.xpath("//div[text()='₹8,999']")).getText();
		System.out.println(prize);

		// Here we are giving the time to that elements within this rimw driver will direct findout all elemets.

		Thread.sleep(2000);

		// Here we are giving the printng statements

		System.out.println(" The above test case is passed.........");

		// Here we are just closing the window.

		driver.quit();
	
		// Finally we close the browser.
	}
}




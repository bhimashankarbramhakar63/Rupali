package X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSWith {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.get("http://facebook.com");


		// The Partial value of the attribute, which we expect from the attribute to start.
		driver.findElement(By.xpath("(//a[starts-with(@href,'https://www.fa')])[1]")).click();

		driver.navigate().back();

		// we need to give the partial value of the attribute
		driver.findElement(By.xpath("//input[starts-with(@name,'e')]")).sendKeys("Bramha");


		// x path by text()
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();

		driver.navigate().back();

		// x path by and
		driver.findElement(By.xpath("//input[@name='pass' and  @id='pass']")).sendKeys("Ashu@123");

		// x path by or
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass']")).clear();
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass']")).sendKeys("Ashu@123");

		// x path by ancestor
	   driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]/ancestor::div/a")).click();
	   
		
		// x path by ancestor
		
		
		
		
	}
}

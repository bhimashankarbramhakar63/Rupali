package Flipcard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	
	public static void main(String[] args) throws Throwable {
		//set the properties
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//b[text()='Admin']")).click();
		  WebElement options=driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		  System.out.println(options);
		  Thread.sleep(2000);
		  Select s=new Select(options);
		  //by visible text
		  //s.selectByVisibleText("ESS");
		  
		  
		  
		  
		  
		  //by value
		  //s.selectByValue("1");
		  
		  
		  //by index
		  s.selectByIndex(2);
		  
		  
		  
		  
		}
	}
	
	
	 
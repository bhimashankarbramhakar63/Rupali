package Action_Clas.javascriptexecutershridharr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		//WebDriver.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Creating the javascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Launching the Site
		
		driver.get("https://demo.guru99.com/v4/");
		
		driver.manage().window().maximize();
		
		WebElement button =driver.findElement(By.name("btnLogin"));
		
		//Login to Guru99
		driver.findElement(By.name("uid")).sendKeys("mngr369390");
		
		driver.findElement(By.name("password")).sendKeys("vadYzeb");//ajyjAna
		//perform click on LOGIN button using javascriptExecutor
		
		js.executeScript("alert('welcome to Selenium java Automation class');");
		
		driver.switchTo().alert().accept();
		
		//vertical scroll down by 400 pixels 
		
		js.executeScript("history.go(0)");
		
		//Get title of a webpage 
		
		String sText1=js.executeScript("return document .title;").toString();
		System.out.println("Title of webpage:"+sText1);
		
			System.out.println("Completed");
		}
			
}



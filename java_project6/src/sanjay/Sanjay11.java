package sanjay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanjay11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrom.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/");
	/*
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("bbramhakar12@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	boolean text = driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed();
	System.out.println(text);
	
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
	driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
	boolean text2 = driver.findElement(By.xpath("//div[@class='caption']//a[text()='iPhone']")).isDisplayed();
	System.out.println(text2);
	
	driver.findElement(By.xpath("//div[@class='caption']//a[text()='iPhone']")).click();
	WebElement quinty = driver.findElement(By.id("input-quantity"));
	quinty.clear();
	quinty.sendKeys("3");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	Thread.sleep(3000);
	boolean text3 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']//a[text()='shopping cart']")).isDisplayed();
	System.out.println(text3);
	
	driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']//a[text()='shopping cart']")).click();
	driver.findElement(By.xpath("//div[@class='pull-right']//a[text()='Checkout']")).click();
*/
	
}
}

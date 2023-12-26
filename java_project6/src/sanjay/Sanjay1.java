package sanjay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sanjay1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable notification");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("9322599801");
	driver.findElement(By.id("pass")).sendKeys("Ankita@123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();

    
    Thread.sleep(3000);    
    
    driver.findElement(By.xpath("//a[@aria-current='page']")).click();
    driver.findElement(By.xpath("//div[@aria-label='Create a post']/div[1]")).click();
   System.out.println("complted");
    
   Thread.sleep(5000);
   
 //  driver.findElement(By.xpath("//div[@style='user-select: text; white-space: pre-wrap; word-break: break-word; font-size: 24px;']")).sendKeys("7tot")
   
   Thread.sleep(5000);
   driver.findElement(By.xpath("//i[@aria-label='Insert an emoji']")).click();
    
   
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@class='thwo4zme rs0gx3tq tv7at329 q9uorilb'])[19]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='thwo4zme rs0gx3tq tv7at329 q9uorilb'])[19]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='thwo4zme rs0gx3tq tv7at329 q9uorilb'])[19]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='thwo4zme rs0gx3tq tv7at329 q9uorilb'])[19]")).click();
    
  Thread.sleep(5000);
  
  driver.findElement(By.linkText("What's on your mind, Bhimashankar?")).sendKeys("yeyeyeyey");
  
  //  JavascriptExecutor java = (JavascriptExecutor)driver;
  //  java.executeAsyncScript("arguments[0].value = 'Sanjay@123' " , click);
    
  //  java.executeScript("arguments[0].value='bbramhakar12@gmai.com' ", valueput);
    
  /*
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[12]")).click();
    System.out.println("completed");
    
    
    
    
    /*
    
   WebElement text = driver.findElement(By.linkText("What's on your mind, Bhimashankar?"));
    text.click();
    Thread.sleep(3000);
    text.sendKeys("hi");
    */
    
	
	Thread.sleep(3000);
	
	
	
//	driver.quit();
	
	
	
	
	
	
	
	
}
}

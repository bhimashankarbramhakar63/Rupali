package sanjay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YouTube {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrom.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/feed/history");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/feed/history");
	
	driver.findElement(By.xpath("(//tp-yt-paper-item[@role='tab'])[1]")).click();
	driver.findElement(By.xpath("(//tp-yt-paper-item[@role='tab'])[5]")).click();
	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	search.click();
	search.sendKeys("qafox ");
	
	 WebElement cutie_noora = driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));    
	  
	  List<WebElement> noora_didi =  cutie_noora.findElements(By.tagName("li"));
	  
		System.out.println(noora_didi.size());
		
	System.out.println("------------------------------------------------------------------------------");
  
		for( WebElement sweetu_noora  : noora_didi) {	
			
		String all_noora =	sweetu_noora.getText();
			System.out.println(all_noora);
		}
		
	System.out.println("------------------------------------------------------------------------------");
		
		Thread.sleep(3000);
		
		for(int j = 0 ; j<noora_didi.size(); j++) {
			
			if(noora_didi.get(j).getText().toLowerCase().contains("selenium")) {
				
				noora_didi.get(j).click();
				break;
			}
		
	  }  
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@id='button'])[9]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@id='primary-text-container'])[2]")).click();
		
           	String expected_language = "Hindi";
		
	Thread.sleep(3000);
	
      List<WebElement> list = driver.findElements(By.xpath("(//div[@id='sections'])[3]"));
      
      boolean is_language_present  = false; 
      
      for (WebElement atual_lang : list) {
      	  
	   	System.out.println(atual_lang.getSize());
	
	   	String atual_langauage =  atual_lang.getText();
	   	System.out.println(atual_langauage);
		
	    if(expected_language.equalsIgnoreCase(atual_langauage)) {
	    	
	    	is_language_present = true;
	    	break;
	    }
	    
	}
      
      System.out.println("----------------------------------------------------------------------------------------------------");
      
      if(is_language_present)
      {
    	  System.out.println("The given lang is present : Test case is pass ");
      }else 
      {
    	  System.out.println("The given lang is not present : Test case is failed.");
      }
      
      
      Thread.sleep(3000);      
      driver.findElement(By.xpath("(//*[@id='back-button'])[2]")).click();
      
      Thread.sleep(4000);
      driver.findElement(By.xpath("(//ytd-compact-link-renderer[@class='style-scope yt-multi-page-menu-section-renderer'])[4]")).click();
      
      Thread.sleep(3000);    
      
      String expected_location = "Zimbabwe";
      
   List<WebElement> all_lang =  driver.findElements(By.xpath("//tp-yt-iron-dropdown[@horizontal-align='auto']"));
   
   boolean is_location_present = false;
   
   for(WebElement location : all_lang) {
	   
	   System.out.println(location.getSize());   
	   String actual_location =  location.getText();
	 
	 System.out.println(actual_location);
	  
	     if(expected_location.equalsIgnoreCase(actual_location)) {
	    	 
	    	  is_location_present = true;
	    	  break;
	     }
   }

          if(is_location_present) 
          {
        	  System.out.println("Location is available : Test case is pass...");
          }else     	  
          {
        	  System.out.println("Location is not available : Test case is failed...");
          }
      System.out.println("---------------------------------------------------------------------------------------------------------");
      System.out.println("All location printed...");
      System.out.println("---------------------------------------------------------------------------------------------------------");
      
  	Thread.sleep(3000);
  	
   
	driver.quit();
	
    }
}

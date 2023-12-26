package Alert_Handleing;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample1_Alert_handle {
	
		   public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		   driver.get("https://demoqa.com/");
		   
		String  title_of_the_page =  driver.getTitle();
		   
	       System.out.println("Title of the page is => " + title_of_the_page);
			
		   Thread.sleep(1000);
		   
		  String url =  driver.getCurrentUrl();
		  
		   System.out.println(" The url of the page is => " + url);
		   
		   Thread.sleep(2000);
		   
		   if(driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed()) {
			   
			   System.out.println("Correct link has been opened here successfully...");
		   }else {
			   
			   System.out.println(" Wrong url is filled , Please check the corect url ");
		   }
		 
		   Thread.sleep(2000);
	
		   driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("(//span[@class='text'])[1]")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.id("userName")).sendKeys("Baboo Ankita");
		   
		   driver.findElement(By.id("userEmail")).sendKeys("Anlita@Example.com");
		   
		   driver.findElement(By.id("currentAddress")).sendKeys(" U will be my first and last bestfriend. No one can takes the position of you in my heart.");
		   
		   driver.findElement(By.id("permanentAddress")).sendKeys("At Post.Vishnupuri. TQ. Umarkhed. District. Yevatmal");
		   
		   Thread.sleep(2000);
		
		   driver.navigate().back();   
		   
		   driver.findElement(By.xpath("(//span[@class='text'])[2]")).click();
		   
		  Thread.sleep(1000);
		  
		 WebElement checkbox_clicked =  driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		 
		 System.out.println(checkbox_clicked.isSelected());  
		 
		  checkbox_clicked.click(); 
		   
		   Thread.sleep(1000);
		   
		boolean conformation =   checkbox_clicked.isSelected();
		
	    System.out.println(conformation);
		   
	    Thread.sleep(1000);
	    
	    driver.navigate().back();
		   
	    driver.findElement(By.xpath("(//span[@class='text'])[3]")).click();
		   
	    Thread.sleep(2000);
	    
	  WebElement radio_yes =  driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
	  
	  System.out.println(radio_yes.isSelected());
	  
	  radio_yes.click();
	  
	  Thread.sleep(2000);
	  
	  if(driver.findElement(By.xpath("//span[@class='text-success']")).isDisplayed()) {
		  
		  System.out.println("Radio yes button is clicked successfully....");
	  }else {
		  
		  System.out.println(" Radio yes button is not xlicked successfully , please try again later....");
	  }
	  
	  Thread.sleep(2000);
	  
	WebElement impressive_radio =  driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
	  
	System.out.println(impressive_radio.isSelected());
	  
	  impressive_radio.click();
	  
	  Thread.sleep(2000);
	  
	  if(driver.findElement(By.xpath("//span[@class='text-success']")).isDisplayed()) {
		  
		  System.out.println("Impressive radio button is clicked successfully.....");
	  }else {
		
		  System.out.println("Not clicked iompresive radio button, please try agin later...");
	}
	  
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	
	  Thread.sleep(2000);
	  
	driver.findElement(By.xpath("(//div[@class='icon'])[1]")).click();
	  
	Thread.sleep(2000);

	  driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]")).click();
	  
	  Thread.sleep(2000);
  
	  driver.findElement(By.xpath("(//span[@class='text'])[10]")).click();
	 
	  Thread.sleep(2000);
	 
	  driver.findElement(By.id("firstName")).sendKeys("Ankita");
	  
	  driver.findElement(By.id("lastName")).sendKeys("Patil");
	  
	  driver.findElement(By.id("userEmail")).sendKeys("Ankita@123.gmail.com");
	  
	  Thread.sleep(2000);
	
	WebElement click_male =   driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]"));
	  
	  System.out.println(click_male.isSelected());
	  
	  click_male.click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("userNumber")).sendKeys("9322599801");
	  
	  Thread.sleep(3000);

	  driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
	  
	  Thread.sleep(2000);
	  
	  Select selct_drop_month = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	  
	List<WebElement> all_month_dates_print =  selct_drop_month.getOptions();
	  
	System.out.println(all_month_dates_print.size());
	  
	  for(int i = 1; i<all_month_dates_print.size();  i++) {
		  
	String print_all_dates =	  all_month_dates_print.get(i).getText();
	
	System.out.println(print_all_dates);
	
	  }
	  
	  selct_drop_month.selectByVisibleText("April");
	  
	  System.out.println("-------------------------------------------------------------------------------------");
	  
	  driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
	  
	  Thread.sleep(2000);
	  
	  Select year = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
	  
	List<WebElement> sagle_year =  year.getOptions();
	
	  System.out.println(sagle_year.size());
	  
	  for(int j= 1; j< sagle_year.size(); j++) {
		  
		 String  print_year =  sagle_year.get(j).getText();
		 
		 System.out.println(print_year);
	  }
	  System.out.println("-------------------------------------------------------------------------------------");
	  
	  year.selectByValue("1997");
	  
	  driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, April 20th, 1997']")).click();
	  
	  Thread.sleep(3000);
	  
//	  Thread.sleep(5000);
	  
//	WebElement click_link = driver.findElement(By.xpath("//div[@id='subjectsWrapper']"));
	 

	//click_link.sendKeys("ktfytydrd");	  
	  
	WebElement click_checkbox =  driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
	
	System.out.println(click_checkbox.isSelected());
	
	click_checkbox.click();
	  
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(" Always Living In Heart ");
	
	Thread.sleep(2000);
	
	List<WebElement> print_state = driver.findElements(By.xpath("(//div[@class=' css-2b097c-container'])[2]"));
	
	System.out.println(print_state.size());
	
	for(int a = 1; a<print_state.size(); a++) {
		
	String all_state = 	print_state.get(a).getText();
	
	System.out.println(all_state);
	
	}
	System.out.println("All states are printed successfuly......");
	System.out.println("-------------------------------------------------------------------------------");
	
	System.out.println("All formfilled up successfully.....");

	driver.navigate().back();
	
	driver.findElement(By.xpath("(//div[@class='icon'])[2]")).click();
	
	driver.findElement(By.xpath("(//div[@class='header-text'])[3]")).click();
	
	   
		/*  Thread.sleep(3000);
		  
		   driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]")).click();
	*/	   
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//span[@class='text'])[11]")).click();
		   
		  Thread.sleep(2000);
		  
		   driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		   
		   Thread.sleep(3000);
		   
		 Set<String> handling_windows =  driver.getWindowHandles();
		   
		   System.out.println(handling_windows);
		   
		   
		Object[] windows_name  =   handling_windows.toArray();
		   
		   String second_window = windows_name[1].toString();
		   
		   String first_window = windows_name[0].toString();
		   
	     String title_of_the_second_window	 =   driver.getTitle();
		   
		   System.out.println("Second window title => " + title_of_the_second_window);
		   
		   Thread.sleep(3000);
		   
		  driver.switchTo().window(first_window);
		  
		String title_of_the_first_window =  driver.getTitle();
		   
		   System.out.println(" first window title => " + title_of_the_first_window);
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		   
		   Thread.sleep(2000);
		   
		  driver.switchTo().window(first_window);
		  
		  Thread.sleep(2000);
		  
		   driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		   Thread.sleep(2000);
		   
		   driver.switchTo().window(first_window);
		   	
			Thread.sleep(3000);
			
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("window.scrollBy(0, 800)");
			   
			   Thread.sleep(3000);
			   
			  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")).click();   // Alert started '......
			     
			  
			   driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			   
			   Thread.sleep(3000);
			   driver.switchTo().alert().accept();
			   
			   System.out.println("---------------------------------------------------------------------------------------------");
			   
			   System.out.println(" first alert handled successfully...");
			   
			   driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
			   
			   WebDriverWait wait = new WebDriverWait(driver, 5);
			   wait.until(ExpectedConditions.alertIsPresent());
			   
			   driver.switchTo().alert().accept();
			   
			   System.out.println(" Second alert accepted.....");
			      
			   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			   
			   Thread.sleep(2000);
			   
			   driver.switchTo().alert().accept();
			   
			   Thread.sleep(3000);
			   
			   if(driver.findElement(By.xpath("//span[@class='text-success']")).isDisplayed()) {
				   
				   System.out.println(" On Ok button clicked, alert handled conform .");
			   }else {
				   
				   System.out.println(" Not clicked, Plese try again later . " );
			   }
			   
			   System.out.println(" Third alert handled successfully ");
			   
			   Thread.sleep(3000);
			   
			   driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			   
			   driver.switchTo().alert().accept();
			   
			   System.out.println(" fourth alert handled successfully....");
			   
			   System.out.println("---------------------------------------------------------------------------------------");   // Alert over
			  
			 //  Thread.sleep(5000);  
	/*			
				driver.findElement(By.xpath("(//li[@class='btn btn-light '])[13]")).click();      // iframe gets starting.....
				
				Thread.sleep(5000);
				
				js.executeScript("window.scrollBy(0, 400)");
				
				System.out.println("--------------------------------------------------------------------------------------------------------------");
				
		        String print_text =	driver.findElement(By.xpath("//div[contains(text(),'There are 2')]")).getText();
				
				System.out.println("text is => " + print_text);	
				
				System.out.println("--------------------------------------------------------------------------------------------------------------");
				
				Thread.sleep(5000);
				
				driver.switchTo().frame(driver.findElement(By.id("frame1")));
				
				Thread.sleep(3000);
				
				System.out.println("---------------------------------------------------------------------------------------------------------------");
				
				 String print_second_frame__text =	driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText();
					
					System.out.println("text is => " + print_second_frame__text);	
				
				   driver.navigate().back();	   
		
				   // i frames handleing started 
	*/		
					Thread.sleep(4000);
								
					driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[4]")).click();
					
					System.out.println("----------------------------------------------------------------------------------------------------------");
					
				   String print_nested_text =	driver.findElement(By.xpath("//div[contains(text(),'There are nested iframes ')]")).getText();
					
					System.out.println("Nested frame text => " + print_nested_text );
					
					System.out.println("----------------------------------------------------------------------------------------------------------");
					
					js.executeScript("window.scrollBy(0, 400)");
					
					driver.switchTo().frame(driver.findElement(By.id("frame1")));
					
					Thread.sleep(3000);
					
					System.out.println("-------------------------------------------------------------------------------------------------");
					
					if (driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).isDisplayed()) {
						
						System.out.println(" We have enterd into the parent frame. Test case is passed. ");
					}else {
						
						System.out.println("  Not entered in praent frame, try again later. Fail. ");
					}
					System.out.println("-------------------------------------------------------------------------------------------------");
					
					Thread.sleep(3000);
					
					driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
					
					Thread.sleep(3000);
					
					System.out.println("-------------------------------------------------------------------------------------------------");
					
					if(driver.findElement(By.xpath("//*[contains(text(),'Child Iframe')]")).isDisplayed()) {
						
						System.out.println(" We have enterd in child frame. Pass. ");
					}else {
						
						System.out.println(" Not enterd . Falls");
					}
					System.out.println("-------------------------------------------------------------------------------------------------");

					
					Thread.sleep(3000);
					
					driver.switchTo().parentFrame();
					
					System.out.println("--------------------------------------------------------------------------------------------------");
					
			    	String enterd_in_parent_frame =	driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();
				
					System.out.println(enterd_in_parent_frame);
					
					System.out.println("--------------------------------------------------------------------------------------------------");
						
					driver.navigate().back();
					
					js.executeScript("window.scrollBy(0, 800)");
					
					Thread.sleep(3000);
					
				// model diologs started	
				
					driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]")).click();
									
					driver.findElement(By.id("showSmallModal")).click();
					
					Thread.sleep(2000);
					
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					if(driver.findElement(By.xpath("//div[@class='modal-title h4']")).isDisplayed()) {
						
						System.out.println(" Small module has been clicked success. Pass ");
					} else {
						
						System.out.println(" Not clicked. Failes.");
					}
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					Thread.sleep(2000);
					
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					String small_body_text = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
					
					System.out.println(small_body_text);
					
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
					
					Thread.sleep(2000);
					
					driver.findElement(By.id("showLargeModal")).click();
					
					Thread.sleep(3000);
					
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					if(driver.findElement(By.xpath("//div[@class='modal-title h4']")).isDisplayed()) {
						
						System.out.println(" Large model clicked. Pass");
					}else {
						
						System.out.println(" Not clicked .Fails");
					}
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					Thread.sleep(2000);
					
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					String large_module_text = driver.findElement(By.xpath("//p[contains(text(),'Lorem Ipsum')]")).getText();
					System.out.println(large_module_text);
					
					System.out.println("---------------------------------------------------------------------------------------------------");
					
					driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();		
					
					driver.navigate().back();
					
					driver.findElement(By.xpath("(//div[@class='icon'])[3]")).click();            // model diologs ended
					
				   
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				   
				   
			   Thread.sleep(2000);
			   				   
			   driver.quit();
			   
			
	}
	

}

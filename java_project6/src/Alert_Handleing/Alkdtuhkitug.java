package Alert_Handleing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alkdtuhkitug {




	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/");

		String  title_of_the_page =  driver.getTitle();

		System.out.println("Title of the page is => " + title_of_the_page);

		Thread.sleep(2000);

		String url =  driver.getCurrentUrl();

		System.out.println(" The url of the page is => " + url);

		Thread.sleep(2000);

		if(driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed()) {

			System.out.println("Correct link has been opened here successfully...");
		}else {

			System.out.println(" Wrong url is filled , Please check the corect url ");
		}


		Thread.sleep(5000);

		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[@class='icon'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]")).click();	


		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 800)");

		/*
	   Thread.sleep(3000);

	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")).click();

	  // alert Strarting here

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

	   System.out.println("---------------------------------------------------------------------------------------------");
		 */

		//   iframes are stating here......
		/*	
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class='btn btn-light '])[13]")).click();

		Thread.sleep(3000);
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

		 */		

		// nested frames started   


		Thread.sleep(2000);

		/*		
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

		js.executeScript("window.scrollBy(0, 800)");             iframe ended
		 */	


		// model diolog started 
		/*	
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

		 */

		// widgets are opning 



		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[4]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 500)");
		driver.findElement(By.xpath("//div[@id='section1Heading']")).click();
		Thread.sleep(3000);
		String get_text = driver.findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy ')]")).getText();
		System.out.println(get_text);
		System.out.println("------------------------------------------------------------------------------------------------");
		/*
		driver.findElement(By.xpath("//div[@id='section2Heading']")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'Contrary to popular belief')]")).getText();
		System.out.println(text2);
		System.out.println("------------------------------------------------------------------------------------------------");
		Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("//p[contains(text(),'The standard chunk')")).getText();
		System.out.println(text3);
		System.out.println("------------------------------------------------------------------------------------------------");

		js.executeScript("window.scrollBy(0, 500)");
		driver.findElement(By.xpath("//div[@id='section3Heading']")).click();
		Thread.sleep(3000);
		String text4= driver.findElement(By.xpath("//p[contains(text(),'It is a long established f')]")).getText();
		System.out.println(text4);
		System.out.println("------------------------------------------------------------------------------------------------");

		 */

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/span/div")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[2]")).click();



		//	String actual = "blue";

		Thread.sleep(3000);

		WebElement expacted = driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']"));
		expacted.sendKeys("Bl");

		

		List<WebElement>  actalul = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]"));
		System.out.println(actalul.size());

		Thread.sleep(5000);
		
		for(WebElement list : actalul) {

			String textpPrint = 	list.getText();
			System.out.println(textpPrint);
			
			
			if(textpPrint.equalsIgnoreCase("Black")) {
				
				list.click();
				break;
			}

		}
		
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[2]")).click();
	   
			
		     
		}
		
		
		
		
		
		}

	






		/*private void selectOptionInDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {

		boolean isFound = false;

		for (WebElement option : dropDownOptions) {
			if (option.getText().equals(optionToBeSelected)) {
				option.click();
				isFound = true;
				break;
			}

		}
		if (!isFound)
			System.out.println("No matching opion found.");

	}

	/*
WebElement fff =	driver.findElement(By.xpath("react-select-2-option-0"));

Thread.sleep(5000);


		if(driver.findElement(By.id("react-select-2-option-0")).isDisplayed()){

			fff.click();

		}


		 */
























		//	Thread.sleep(3000);


		//	driver.quit();








	


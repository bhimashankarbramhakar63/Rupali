package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Drop {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(2000);

		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement> allMonths = 	select.getOptions();

		System.out.println(allMonths.size());

		for(int i =1; i<allMonths.size();i++) {

			String printMonth = allMonths.get(i).getText();
			System.out.println(printMonth);
			
			if(printMonth.contains("Me")) {
				allMonths.get(i).click();
				break;
			}
			else {
				Assert.fail("Given Text is not Present");
			}
		}                                             
		System.out.println("Clicked on Submit");
		// Submit
		driver.close();
	
	}


}

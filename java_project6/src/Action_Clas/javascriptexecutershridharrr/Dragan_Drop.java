package Action_Clas.javascriptexecutershridharrr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragan_Drop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");	
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement srcelement,trgelement;
		srcelement = driver.findElement(By.id("draggable"));
		trgelement = driver.findElement(By.id("droppable"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
		
		System.out.println("The test case is passed........");
		driver.quit();
		
	}

}

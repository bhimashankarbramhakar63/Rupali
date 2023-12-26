package Action_Clas.javascriptexecutershridharr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jspractice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://Amezon.com ");
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("history.go(0)");
		
		System.out.println("completed");

		
		
		
		
	}

}

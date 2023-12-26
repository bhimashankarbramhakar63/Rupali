package Get_Windohandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://gmail.com/");	
		String curwindowid =  driver.getWindowHandle();
		System.out.println(curwindowid);
		String titleOfWindow = 	driver.getTitle();
		System.out.println(titleOfWindow);

		driver.findElement(By.linkText("Help")).click();
		String titleOfWindow2 = 	driver.getTitle();
		System.out.println(titleOfWindow2);

		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);


		driver.quit();

	}

}

package Action_Clas.javascriptexecutershridharr;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jspractice4 {


	public static void main(String[] args)	{

		System.setProperty("webdriver.chrome.driver",  "chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//creating the javascriptExecutor interface object by type casting

		JavascriptExecutor js =(JavascriptExecutor)driver;
		

	}

}

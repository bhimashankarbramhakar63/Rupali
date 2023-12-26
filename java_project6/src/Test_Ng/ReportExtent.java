package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportExtent {

	static ExtentTest test;
	static ExtentReports report;
	WebDriver driver;

	@BeforeClass
	public static void startTest() {

		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	@Test
	public void StartTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.get("https://www.amazon.com/");

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
		System.out.println("the link is working");
		driver.findElement(By.linkText("See All")).click();
		
		

	}

	@Test
	public void test2() {
		
		driver.findElement(By.linkText("Electronics")).click();
		String	title1 =driver.getTitle();
		System.out.println("link is working " + title1);

	}

	@AfterClass
	public static void endTest() {

		report.endTest(test);
		report.flush();

	}
}







package All_Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Btoken_Links {

	public static void main(String[] args) throws InterruptedException,IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		

		driver.get("https://dev.events.awana.org/");
	//	driver.get("https://Amezon.com");

		Thread.sleep(5000);
		
		List<WebElement> all_links = 	driver.findElements(By.tagName("a"));
//		List<WebElement> all_links = 	driver.findElements(By.tagName("link"));
		System.out.println(all_links.size());
		
		for(WebElement  link : all_links) {

			String url_link =	 link.getAttribute("href");

			System.out.println(url_link);
			
			if(url_link==null || url_link.isEmpty()) {

				System.out.println("Url link is an empty");
				continue;
			}		
			System.out.println("--------------------------------------------------------------------------------");
				HttpURLConnection connection = (HttpURLConnection)(new URL(url_link).openConnection());

				connection.connect();
				
				if(connection.getResponseCode()==200) {

					System.out.println( "Link is working fine : " + url_link);
					//System.out.println( "Images is working fine : " + url_links);
				}else {

					System.out.println("Link is not working fine : " + url_link);
				//	System.out.println( "Images is not working  : " + url_links);
				}
		}
	}
	}

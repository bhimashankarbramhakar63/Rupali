package All_Automation;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {



		int[] array = {1,2,3,4,4,5,5,6,7,7};

		System.out.println(array.length);

		HashSet<Integer> set = new HashSet<Integer>();

		for(int i = 0; i<array.length; i++){

			if(set.contains(array[i])){
				System.out.println(array[i]);

			}else{
				set.add(array[i]);
			}

		}

	}
}


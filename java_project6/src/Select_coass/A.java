package Select_coass;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.internal.tcnative.SSL;

public class A {

	String name;
	int age;

	public void studentInfo(){
		System.out.println("This is an example of method overloading");
	}
	public void studentInfo(String name){
		System.out.println(name);
	}                                                                            // MethodOverloading

	public void studentInfo(String name, int age){
		System.out.println(name + " " + age);
	}
}





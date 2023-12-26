package Test_Ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test_Practise {
	
/*	String a ="Skip Test";
	if(a.equals("Skip Test")){
	throw new SkipException("Skipping - This is not ready for testing ");
	}*/
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	@BeforeSuite
	public void beforeSuitee() {
		System.out.println(" second beforesuite");
		
	}
	@BeforeClass
	public void test() {

		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void testbefore() {

		System.out.println("before method");
	}

	@Test(priority = 1)
	public void test1() {

		System.out.println("test 1");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test(priority = 3,timeOut =5000)
	public void test3() {
		System.out.println("test 3");
	}
	
	
	@AfterMethod
	public void testAfter() {

		System.out.println("After method");
	}
	@AfterClass
	public void testlast() {
		System.out.println("After class");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

}

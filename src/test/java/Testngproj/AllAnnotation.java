package Testngproj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {
	
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is after suite");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is before test");
	}
	
	@AfterSuite
	void at() {
		System.out.println("this is after suite");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("this is before class");
	}
	
	@AfterSuite
	void ac() {
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("this is before method");
	}
	
	@AfterMethod
	void am() {
		System.out.println("this is after method");
	}
	
	@Test(priority=1)
	void tm1() {
		System.out.println("this is method-1");
	}
	
	@Test(priority=2)
	void tm2() {
		System.out.println("this is method-2");
	}
}

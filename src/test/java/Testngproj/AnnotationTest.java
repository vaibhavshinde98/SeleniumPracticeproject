package Testngproj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeMethod
	void login() {
		System.out.println("login");
	}
	
	@Test
	void search() {
		System.out.println("search");
	}
	
	@Test
	void advancesearch() {
		System.out.println("advance search");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("logout");
	}
}

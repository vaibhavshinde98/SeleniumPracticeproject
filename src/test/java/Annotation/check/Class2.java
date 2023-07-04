package Annotation.check;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	void xyz() {
		System.out.println("this is xyz");
	}
	
	@AfterTest 
	void m() {
		System.out.println("this is aftertest");
	}

}

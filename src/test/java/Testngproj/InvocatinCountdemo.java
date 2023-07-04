package Testngproj;

import org.testng.annotations.Test;

public class InvocatinCountdemo {

	@Test(invocationCount=5)
	void demo() {
		System.out.println("test invocation ");
	}
}

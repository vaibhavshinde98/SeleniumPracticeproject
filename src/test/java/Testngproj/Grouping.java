package Testngproj;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1,groups= {"sanity","regression"})
	void loginbymail() {
		System.out.println("this is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginbyfacebook() {
		System.out.println("login by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginbytwitter() {
		System.out.println("login by twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupbymail() {
		System.out.println("signup by mail");
	}
	
	@Test(priority=5,groups= {"regression"})
	void signupbyfacebook() {
		System.out.println("signupbyfacebook");
	}
	
	@Test(priority=6,groups= {"regression"})
	void signupbytwitter() {
		System.out.println("signupbytwitter");
	}
	
	@Test(priority=7,groups= {"sanity"})
	void paymentindoller() {
		System.out.println("payement in doller");
	}
	
	@Test(priority=8,groups= {"sanity","regression"})
	void paymentinrupee() {
		System.out.println("payment in rupeeeees");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentreturnbybank() {
		System.out.println("payment return by bank");
	}
}

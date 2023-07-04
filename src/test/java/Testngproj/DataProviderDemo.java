package Testngproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	void testLogine(String email,String pwd) 
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider (name = "dp", indices= {0,3})
	String [][] logindata(){
		String data[][]= {
				{"vaibhavshinde2511998@gmail.com","Test@123"},
				{"vs@gmail.com","test@123"},
				{"vaibhavshinde2511998@gmail.com","Test@123"},
				{"vaibhavshinde2511998@gmail.com","@123"}
		};
		return data;
	

}}

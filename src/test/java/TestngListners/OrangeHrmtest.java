package TestngListners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestngListners.ExtendReportManager.class)
public class OrangeHrmtest {
	WebDriver driver;
	@Test(priority=1)
	  void open() {
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
//		  driver.manage().timeouts().implicitlyWait()
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  @Test(priority=2)
	  void login() {
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  }
	  
	  @Test(priority=3)
	  void logocheck() {
		  boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  Assert.assertEquals(status, true);
	  }
	  
	  @Test(priority=4, dependsOnMethods= {"logocheck"})
	  void close() {
		  driver.quit();
	  }
}

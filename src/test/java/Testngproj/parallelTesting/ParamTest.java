package Testngproj.parallelTesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParamTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	void setup(String br, String url) throws InterruptedException {
		if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}



	@Test(priority = 1)
	void TestLogo() {
		try {
			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
		}
		catch(Exception e) {
			Assert.fail();
		}
	
	}
	
	@Test(priority=2)
	void homepageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM","titles are not matched");
	}
	
	@AfterClass
	void close() {
		driver.quit();
	}
}

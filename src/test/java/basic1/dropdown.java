package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vasadash\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/Admin");
		
		driver.manage().window().maximize();
		//login
		WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.clear();
		pass.sendKeys("admin");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
//		WebElement dd1= driver.findElement(By.xpath("//p[normalize-space()='Catalog']"));
//		Select ddmenu= new Select(driver.findElement(By.cssSelector("body > div:nth-child(3) > aside:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")));
//		ddmenu.selectByVisibleText("Attributes");
		
		//click on catlog
		driver.findElement(By.cssSelector("body > div:nth-child(3) > aside:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
		
		//click on product
		driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
		
		//fill the form detials
		
		driver.findElement(By.id("SearchProductName")).sendKeys("Apple");
		
		Select searchwarehouse=new Select(driver.findElement(By.xpath("//select[@id='SearchWarehouseId']")));
		searchwarehouse.selectByIndex(1);
		
		Select categary=new Select(driver.findElement(By.xpath("//select[@id='SearchCategoryId']")));
		categary.selectByIndex(14);
		
		Select proType=new Select(driver.findElement(By.xpath("//select[@id='SearchProductTypeId']")));
		proType.selectByVisibleText("Simple");
		
		Select publish= new Select (driver.findElement(By.xpath("//select[@id='SearchPublishedId']")));
		publish.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@id='SearchIncludeSubCategories']")).click();
		
		Select manufacture= new Select (driver.findElement(By.xpath("//select[@id='SearchManufacturerId']")));
		manufacture.selectByIndex(1);
		
		Select vendor= new Select (driver.findElement(By.xpath("//select[@id='SearchVendorId']")));
		vendor.selectByIndex(1);
		
		
		
		
	}

}

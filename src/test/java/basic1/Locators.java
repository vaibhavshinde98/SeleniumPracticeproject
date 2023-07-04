package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   
//		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\vasadash\\Desktop\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		WebElement emailtxt= driver.findElement(By.id("Email"));
		WebElement emailtxt = driver.findElement(By.id("admin"));
		emailtxt.clear();
		emailtxt.sendKeys("admin@yourstore.com");
		
		WebElement passtxt= driver.findElement(By.id("Password"));
		passtxt.clear();
		passtxt.sendKeys("admin");
		
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
	}

}

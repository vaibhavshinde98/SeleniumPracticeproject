package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdminDemo {

	public static void main(String[] args) throws Exception {
		   System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		
		   driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   WebElement emailtxt= driver.findElement(By.name("Email"));
		   emailtxt.clear();
		   emailtxt.sendKeys("admin@yourstore.com");
		   
		   WebElement passtxt= driver.findElement(By.name("Password"));
		   passtxt.clear();
		   passtxt.sendKeys("admin");
		   
		   
		   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		   driver.quit();
	}

}

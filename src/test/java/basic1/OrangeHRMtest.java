package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMtest {

	public static void main(String[] args) throws Exception {
		
		   System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
		  
		 // WebDriverManager.Chromedriver().setup(); // launch browser // ChromeDriver
		 WebDriver driver=new ChromeDriver(); // int letest selenium version there is no need to

		 
		
		
		
		//open the url in browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//provide username
		
//		WebElement username=driver.findElement(By.name("Username"));
//		username.sendKeys("Admin");
//				or
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String actTitle= driver.getTitle();
		String expTitle= "oranageHRM";
		if(actTitle.equals(expTitle)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.quit();
	}

}

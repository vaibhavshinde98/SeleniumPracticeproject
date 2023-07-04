package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

		driver.quit();
		
	}

}

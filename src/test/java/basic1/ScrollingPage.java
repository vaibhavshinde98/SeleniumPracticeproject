package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//1. scolldown with pixel
		js.executeScript("window.scrollBy(0,3000)", "");
		
		//2. scolldown till the element present
		
		 WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0],scollIntoView();", flag);
		
		
		// scroll till perticular element
	
	
		
	}

}

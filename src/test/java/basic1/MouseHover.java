package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		 WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		 WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		 Actions act=new Actions(driver);
		 
		 //mousehover
//		 act.moveToElement(desktop).moveToElement(mac).click().build().perform();  //create action then perform
		 act.moveToElement(desktop).moveToElement(mac).click().perform();  // directly perform 

	}

}

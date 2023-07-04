package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		 WebElement Button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 Actions act=new Actions(driver);
		 act.contextClick(Button).perform();
		 
		 driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		 driver.switchTo().alert().accept();
	}

}

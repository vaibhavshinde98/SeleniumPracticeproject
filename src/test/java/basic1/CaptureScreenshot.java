package basic1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
//		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,3000)", "");
//		
		
		
		//approach 1 take full page ss
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File scr= ts.getScreenshotAs(OutputType.FILE);
//		File trg= new File("C:\\Users\\vasadash\\eclipse-workspace\\SeleniumProject\\Screenshots\\fullss3.png");
//		FileUtils.copyFile(scr, trg);
		
		// approach 2 capture screenshot of specific area
		
		WebElement productss=driver.findElement(By.xpath("//img[@title='Canon EOS 5D']"));
		
		File src=productss.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\\\Users\\\\vasadash\\\\eclipse-workspace\\\\SeleniumProject\\\\Screenshots\\\\product1.png");
		FileUtils.copyFile(src, trg);
	}

}

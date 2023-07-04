package basic1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IteraDemoWebsite {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vasadash\\\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vaibhav");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7744966035");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vs@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Pune,India");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
		
		
//		select radio button
		WebElement rdmale=driver.findElement(By.id("male"));
		WebElement rdfemale=driver.findElement(By.id("female"));
		rdmale.click();
		
		
		//select checkboxes
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//		System.out.println(checkbox.size());
		
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
		//select dropdown
		
		WebElement ddcontry=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select ddc= new Select(ddcontry);
		ddc.selectByVisibleText("Turkey");
		
		
		
		//upload file
		WebElement upload_file=driver.findElement(By.xpath("//input[@id='inputGroupFile02']"));
//		upload_file.sendKeys("C:\\Users\\vasadash\\Pictures\\assismnetbigta.PNG");
		
		
		
		// take screenshot
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File scr= ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File("C:\\Users\\vasadash\\eclipse-workspace\\SeleniumProject\\Screenshots\\ts1.png");
//		FileUtils.copyFile(scr, trg);
//		
		
		// take ss of specific area
//		WebElement trtelment=driver.findElement(By.xpath("//div[normalize-space()='File input practice']"));
//		File scr1= trtelment.getScreenshotAs(OutputType.FILE);
//		File loc= new File("C:\\\\Users\\\\vasadash\\\\eclipse-workspace\\\\SeleniumProject\\\\Screenshots\\\\ts01.png");
//		FileUtils.copyFile(scr1,loc);
		
		
		
		// scrolldown page
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,3000)", "");
		
		//scroll till perticular element
		
		WebElement targetl=driver.findElement(By.xpath("//select[@class='custom-select']"));
		js.executeScript("argument[0],ScrollIntoView", targetl);
	}

}

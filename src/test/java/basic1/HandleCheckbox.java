package basic1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		System.out.println(checkbox.size());
		
//		for(int i=0;i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}
//		
		//advance loop
		
//		for(WebElement chbox:checkbox) {
//			chbox.click();
//		}
//		
		
		//select last 2 checkboxes
		// total no of checkboxes- how many check boxes need to select= starting index
		//7-3=5(starting index)
//		for(int i=5;i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}
//		
//		//select first 2 checkboxes
//		for(int i =0;i<2;i++) {
//			checkbox.get(i).click();
//		}
		
		//check/uncheck 
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
		Thread.sleep(3000);
		for(int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).isSelected()) {
				checkbox.get(i).click();

			}
		}
		
		Thread.sleep(3000);

		driver.quit();
		
	}

}

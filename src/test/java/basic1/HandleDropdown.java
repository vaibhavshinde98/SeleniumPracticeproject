package basic1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select ddCountry= new Select(dropdown);
		
		ddCountry.selectByVisibleText("Turkey");
		ddCountry.selectByValue("Sweedon");
		ddCountry.selectByIndex(6);
		
		//2)find total option in dropdown
		
//		List<WebElement> options=ddCountry.getOptions();
//		System.out.println("total number of options: "+options.size());
		
		
		//3.  print options in console window
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}

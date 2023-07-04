package basic1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//approach 1
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/15/2000");
		
		String year="2023";
		String month="May";
		String date="15";
		
		
		//approach 2
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		while(true) {
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yrs= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yrs.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next month
		}
		
		//select date
		List<WebElement> allDate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		System.out.println(allDate);
		
		for(WebElement dt:allDate) {		//enhanced for loop
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

}

package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWIthInpute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		alertwindow.sendKeys("welcome");
		alertwindow.accept();
		
		String act= driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp="You entered: welcome";
		if(act.equals(exp)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is fail");
		}
		
		
	}

}

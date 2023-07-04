package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.accept();  // this will close alert window using ok button
		//alertwindow.dismiss(); // this will close alert window using cancel buttton
		
	}

}

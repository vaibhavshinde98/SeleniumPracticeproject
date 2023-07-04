package basic1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//aproach 1
		Set<String> windoIds=driver.getWindowHandles();
		List<String> windolist= new ArrayList(windoIds);
		
		String parentwindo= windolist.get(0);
		String childwindo= windolist.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindo);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/div/ul/li[1]/a/button")).click();
		
		
		//switch to parent windo
		
		driver.switchTo().window(parentwindo);
		driver.findElement(By.name("username")).sendKeys("Admin");
	}


}

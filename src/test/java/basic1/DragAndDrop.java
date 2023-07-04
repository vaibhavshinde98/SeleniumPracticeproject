package basic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\vasadash\\Desktop\\chromedriver.exe"); //or
				  
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		// rom to itly
		WebElement rom=driver.findElement(By.id("box6"));
		WebElement itly=driver.findElement(By.id("box106"));
		
		act.dragAndDrop(rom, itly).perform();
		
		//oslo to norway
		WebElement oslo=driver.findElement(By.id("box1"));
		WebElement Norway= driver.findElement(By.id("box101"));
		
		act.dragAndDrop(oslo, Norway).perform();
	}

}

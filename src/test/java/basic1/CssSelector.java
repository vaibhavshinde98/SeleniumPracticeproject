package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vasadash\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		
		// ccss with tag and class
//		driver.findElement(By.cssSelector(".search-box input.search-box-text, .search-box .search-box-button")).sendKeys("MackBook");
		
		// css selectort with tag and attributes
		driver.findElement(By.cssSelector("input[type=text]f")).sendKeys("Mackbook");
//		driver.quit();
		

	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	@Test
	public static void googleSearch() {
				
		//goto google.com
	driver.get("https://google.com");
	
	//enter text in search textbox
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	
	//click on search button
	//driver.findElement(By.name("btnk")).click();
	driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	
	
	}
	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
}


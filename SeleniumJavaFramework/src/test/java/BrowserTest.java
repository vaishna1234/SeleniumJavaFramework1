import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
	String projectpath = System.getProperty("user.dir");
	System.out.println("projectpath :"+projectpath);
		System.setProperty("webdriver.gecko.driver", projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	//System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	
		//System.setProperty("webdriver.ie.driver", projectpath+"\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		List<WebElement> listOfInputElements =  driver.findElements(By.xpath("//input"));
		
		int count = listOfInputElements.size();
		System.out.println("Count of Input Element : "+count);
		
		//WebElement textBox = driver.findElement(By.id("input"));
		
		//textBox.sendKeys("Automation Step by Step");
		
		Thread.sleep(3000);
		driver.close();
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
	
		String projectpath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
	System.setProperty("webdriver.ie.driver", projectpath+"\\drivers\\iedriver\\IEDriverServer.exe");
    WebDriver driver = new InternetExplorerDriver(caps);

    driver.get("https://google.com");
    driver.findElement(By.name("Search")).sendKeys("ABCD");
    driver.findElement(By.name("Search")).sendKeys(Keys.RETURN);
    
    driver.close();
    driver.quit();
    
	}

}

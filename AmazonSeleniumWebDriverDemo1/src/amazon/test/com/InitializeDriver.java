package amazon.test.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {
	
	public WebDriver InitializeDriverMethod(String url) {
	  WebDriver driver;
	  driver =new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	return driver;
    }
}

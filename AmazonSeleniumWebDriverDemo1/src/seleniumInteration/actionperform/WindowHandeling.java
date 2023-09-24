package seleniumInteration.actionperform;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import amazon.test.com.InitializeDriver;

public class WindowHandeling {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		driver = new InitializeDriver().InitializeDriverMethod("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		Set<String> allwindows=  driver.getWindowHandles();
		System.out.println(allwindows);
		
		for(String eachWindow:allwindows) {
			if(!eachWindow.equalsIgnoreCase(mainWindow)) {
				System.out.println( driver.switchTo().window(eachWindow));
				String WindowContent =driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(WindowContent);
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(mainWindow);
		driver.findElement(By.id("tabButton")).click();
		allwindows=  driver.getWindowHandles();
		System.out.println(allwindows);

	}

}

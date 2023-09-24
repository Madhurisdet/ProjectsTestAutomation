                          package seleniumInteration.actionperform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import amazon.test.com.InitializeDriver;

public class ClicksOnObjects {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new InitializeDriver().InitializeDriverMethod("https://www.calculator.net/investment-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement calculatorButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
		calculatorButton.click();
		
		Actions actionobj = new Actions(driver);
		calculatorButton= driver.findElement(By.xpath("//input[@value='Calculate']"));
		
		actionobj.contextClick(calculatorButton).perform();
		actionobj.doubleClick(calculatorButton).perform();

	}

}

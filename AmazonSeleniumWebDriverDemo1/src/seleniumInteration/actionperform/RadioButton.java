package seleniumInteration.actionperform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import amazon.test.com.InitializeDriver;

public class RadioButton {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		driver = new InitializeDriver().InitializeDriverMethod("https://www.calculator.net/investment-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement selectRadiobutton = driver.findElement(By.xpath("//input[@id='cadditionat1']//parent::label//span"));
		selectRadiobutton.click();
		Thread.sleep(2000);
		
		System.out.println(selectRadiobutton.isDisplayed());
		System.out.println(selectRadiobutton.isEnabled());
		System.out.println(selectRadiobutton.isSelected());
		if(!selectRadiobutton.isSelected()== true) {
			selectRadiobutton.click();
			System.out.println("radioButton is selected now");
			System.out.println(selectRadiobutton.isSelected());
		}
		else {
			System.out.println("radioButton is not selected");
		}
		
		
	
	}

}

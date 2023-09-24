package seleniumInteration.actionperform;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import amazon.test.com.InitializeDriver;

public class DropDownDemo {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver=  new InitializeDriver().InitializeDriverMethod("https://www.calculator.net/investment-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement selectdropdown=driver.findElement(By.id("ccompound"));
		Select selectdropdownobj = new Select(selectdropdown);
		Thread.sleep(2000);
		selectdropdownobj.selectByIndex(3);
		selectdropdownobj.selectByValue("semiannually");
		selectdropdownobj.selectByVisibleText("daily");
		List <WebElement> dropdownoption = selectdropdownobj.getOptions();
		for(WebElement eachdropoption :dropdownoption)
		{
			System.out.println(eachdropoption.getAttribute("value"));
		}
		
		
		
	}

}

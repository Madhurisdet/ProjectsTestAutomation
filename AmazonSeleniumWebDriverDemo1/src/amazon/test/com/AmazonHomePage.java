package amazon.test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	
	public void searchProduct(String ProductType, String ProductName) {
		AmazonFirstSelenium.driver.findElement(By.id("searchDropdownBox")).click();
		AmazonFirstSelenium.driver.findElement(By.xpath("//option[text()='"+ProductType+"']")).click();
		AmazonFirstSelenium.driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ProductName);
		AmazonFirstSelenium.driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	
	
	public void selectProductFromResult(String ResultToSelect) {
		List<WebElement> allProductTitle = AmazonFirstSelenium.driver.findElements(By.xpath("//*[contains(@data-cel-widget,'search_result')]//h2//span"));
	   	 for(WebElement eachTitle : allProductTitle)
	   	 {	
	   	  	if(eachTitle.getText().contains(ResultToSelect)) 
	   	  	 {
	   	  		eachTitle.click();
		    	break;
	   	  	 }		
	   	 }
	}
}

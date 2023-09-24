package amzonwebpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePages {
//local variable
	 WebDriver driver;
	
//object locators
	 By alldropdownProductType = By.xpath("//*[@title='Search in']");
	 By searchTextBox = By.id("twotabsearchtextbox");

//Constructor
	 public AmazonHomePages(WebDriver driver) 
	 {
		 this.driver=driver; //assigning driver to the class variable
	 }
	
//Methods/basic functionality implementation of this class
	 //1st method for searching all dropdown product type
	 public void searchProducDropdown (String ProducName) 
	 {
		WebElement alldropdownoptionObj=driver.findElement(alldropdownProductType);
		Select selectdropdownObj  = new Select(alldropdownoptionObj);
		selectdropdownObj.selectByVisibleText(ProducName);		 
	 }

//2nd method for searching Product Name in SearchBox/TextBox
	 public void searchTextIntoSearchBox(String searchTextIntoBox) 
	 {
		 WebElement searchTextIntoBoxObj= driver.findElement(searchTextBox);
		 searchTextIntoBoxObj.sendKeys(searchTextIntoBox);	 
	 }
	 
}

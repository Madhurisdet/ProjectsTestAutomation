package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelloSignInAccountHomePage {

WebDriver driver;
 
//locators
 @FindBy (xpath = "//a[@id='nav-link-accountList']") WebElement helloSignInClick;
 @FindBy(xpath = "//input[@id='ap_email']") WebElement signInTextBox;
 @FindBy(xpath = "//input[@id='continue']//parent::span") WebElement signInContinewButton;
 @FindBy(xpath = "//input[@name='rememberMe']//parent::label//input") WebElement keepmesigninCheckbox;
 
 
//Constructor
 public HelloSignInAccountHomePage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);

	}
 
 //Methods
 public void HelloSignInAccount(String email) throws Exception{
	 helloSignInClick.click();
	 Thread.sleep(2000);
	 signInTextBox.sendKeys(email);
	 signInContinewButton.click();
	 keepmesigninCheckbox.click();
	 System.out.println(keepmesigninCheckbox.isSelected());
	 if(keepmesigninCheckbox.isSelected()==true)
	 {
		 System.out.println("checkbox is selected");
	 }
	 else {
		 System.out.println("checkbox is not selected");
	 }
 }

}

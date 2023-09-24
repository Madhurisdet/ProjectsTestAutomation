package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ALLHomePageOptions {
	private static final String Laptop = "";

	private static final String eachProduct = "";

	WebDriver driver;
	
//locators
	@FindBy (xpath = "//div[@class='nav-left']//a[@id='nav-hamburger-menu']") WebElement allButtonClick;
	//@FindBy(xpath = "//a[@class='hmenu-item']//parent::li") 
	//List<WebElement> allHomepageoption;
	@FindBy (xpath = "//div[@class='nav-sprite hmenu-close-icon']//parent::div//div") WebElement AllClickClose;
	@FindBy(xpath = "//div[@id='CardInstanceCNnlFORn-X1EeDbaGN-vxQ']//child::a") List<WebElement> anyDepartMent;
	@FindBy(xpath = "//div[@role='treeitem']//a[contains(text(),'"+eachProduct+"')]")  List<WebElement> productFromResult;
	
	
//Constructor
	public ALLHomePageOptions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Method to implement class
	
	public void allOptionHomePage() {
		allButtonClick.click();
		AllClickClose.click();
		
	}
	//selecting product from any department option
	public void selectAnyDepartment(String departmentName)
	{
		for(WebElement eachDepartment : anyDepartMent)
		{
			if(eachDepartment.getText().equalsIgnoreCase(departmentName))
			{
				eachDepartment.click();
				break;
				
			}
		}
	}
	
	//clicking on product from department
	public void selectProductFromfromResult(String ProductFromResult ) {
		for(WebElement eachProduct : productFromResult)
		{
			if(eachProduct.getText().equalsIgnoreCase(ProductFromResult))
			{
				eachProduct.click();
				break;
			}
		}
		
	}
	
}

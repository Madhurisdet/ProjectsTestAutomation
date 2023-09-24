package pageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePageFactory {
WebDriver driver;  //local Variable
	
//locators
	@FindBy(xpath = "//*[@title='Search in']") WebElement searchAlldropdown;	
	@FindBy(id = "twotabsearchtextbox") WebElement searchTextBox ;
	@FindBy(xpath = "//*[@id='nav-search-submit-button']") WebElement searchclickbutton;
	@FindBy(xpath = "//div[contains(@data-cel-widget,'search_result')]//h2//span")  List<WebElement> allProductTitle;
	@FindBy(xpath = "//div[@id='nav-main']//a[contains(@class,'nav-a')]") List<WebElement> amazonHomePageHeaders;	
	//@FindBy(xpath = "//div[@id='detailBulletsWrapper_feature_div']//span[@class='a-list-item']//parent::span/span[2]")
	//WebElement productDetails;

	
	
//Constructor
	public AmazonHomePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); //this will load all the web elements into page
	}
	
//Methods/functionality to implement this class
	public void searchProducTypeDropdown(String ProducType) {
		Select selectdropdownObj = new Select(searchAlldropdown);
		selectdropdownObj.selectByVisibleText(ProducType);
	}
	
	public void searchTextIntoSearchBox(String ProductName) {
		searchTextBox.sendKeys(ProductName);
		searchclickbutton.click();
		
	}
//ProductTitle From All Titles
	public void selectProductfromResult(String productTitle) {
		for(WebElement eachTitle : allProductTitle) {
			//System.out.println(eachTitle.getText());
			if(eachTitle.getText().equalsIgnoreCase(productTitle)){
				eachTitle.click();
				break;
			}
		}
	}	
	
//allheaders
	public void allHeadersOfPage(String headerTitles) {
		for(WebElement eachHeader : amazonHomePageHeaders) {
			//System.out.println(eachHeader.getText());
			if(eachHeader.getText().contains(headerTitles)) {
				eachHeader.click();
				break;
			}
		
	}
	}	
	
}

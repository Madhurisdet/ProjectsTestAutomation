package pageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage {
	private static final String eachProdTitle = "";
	WebDriver driver;

//locators
	@FindBy(xpath = "//*[contains(text(),'"+eachProdTitle+"')]//parent::span//span[2]") WebElement ProductDetails;
	
public AmazonProductPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	//Product Details
	
			public Map<String,String> ProductDetails1(List <String> productDetailtitles ) {
			Map<String,String> prodDetails= new HashMap<>();
				for(String eachProdTitle : productDetailtitles) {
					String prodValue = ProductDetails.getText();
					prodDetails.put(eachProdTitle, prodValue);
				}
				return prodDetails;	
				}
}

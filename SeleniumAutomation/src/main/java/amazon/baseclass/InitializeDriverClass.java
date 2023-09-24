package amazon.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amzonwebpages.AmazonHomePages;

public class InitializeDriverClass {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String ProductTypeFromDropDown = "Books";
		String searchProductInTextBox = "books for kids";
		//creating instance for AmazonHome page
		AmazonHomePages amzonpageobj = new AmazonHomePages(driver);
		amzonpageobj.searchProducDropdown(ProductTypeFromDropDown);
		amzonpageobj.searchTextIntoSearchBox(searchProductInTextBox);
		
		
	}

}

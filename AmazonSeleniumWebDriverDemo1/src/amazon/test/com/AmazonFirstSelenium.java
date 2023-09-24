package amazon.test.com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class AmazonFirstSelenium {
	public static WebDriver driver;
	public static void main(String[] args) {	
		 //driver instance	 
    	 driver = new InitializeDriver().InitializeDriverMethod("https://www.amazon.com");
    	 
    	 //1st product info
    	 //Amazon Homepage instance
    	 AmazonHomePage amazonHomePageRef =	 new AmazonHomePage();
         amazonHomePageRef.searchProduct("Apps & Games", "badminton" );
         amazonHomePageRef.selectProductFromResult("Badminton game");
    	 
         //Product page instance
		 System.out.println("Product  Details");
	 	 List<String> ProductDetailTitle = new LinkedList<> ( 
	 	 Arrays.asList("Release Date:","Date first listed on Amazon:","Developed By:","ASIN: ","Customer reviews: "));
		 AmazonProductPage productdetails = new AmazonProductPage ();
     	 for(Map.Entry m: productdetails.getProductDetail(ProductDetailTitle).entrySet()){
     		 System.out.println(m.getKey() +"--> "+ m.getValue());
     	 }
     	 //2nd product info
     	 amazonHomePageRef.searchProduct("Amazon Devices", "hdmi cables" );
         amazonHomePageRef.selectProductFromResult("Amazon Basics High-Speed HDMI Cable (18 Gbps, 4K/60Hz) - 6 Feet, Black");
	}
}
	
	

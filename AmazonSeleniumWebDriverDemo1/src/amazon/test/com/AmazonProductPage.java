package amazon.test.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

public class AmazonProductPage {

	public Map<String,String> getProductDetail(List<String> ProductDetailTitle)
     {
		Map<String,String> productdetail = new HashMap<>();
     	for(String eachProductTitle:ProductDetailTitle) {
     		String productvalue = AmazonFirstSelenium.driver.findElement(By.xpath("//span[contains(text(),'" +eachProductTitle+ "')]//parent::*//span[2]")).getText();
     		
     		productdetail.put(eachProductTitle ,productvalue);
     }
    return productdetail;
  }
}
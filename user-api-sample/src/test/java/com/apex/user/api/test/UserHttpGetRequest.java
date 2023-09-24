package com.apex.user.api.test;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class UserHttpGetRequest {

	@Test
	public static String main(String args[]) throws ParseException, IOException {
		
	
		String url = "https://gorest.co.in/public/v2/users/4425";
		
		//create httpClient connection
		HttpClient client = HttpClientBuilder.create().build();
		
		//creating object for get request
		 HttpGet reqMag =new HttpGet(url);
		 
		 //receiving the response by executing get request
		 HttpResponse response =client.execute(reqMag);
		 
		 //Validation
		 System.out.println(response.getStatusLine().getStatusCode());
		 System.out.println(response.getStatusLine().getReasonPhrase());
		 
		 
		 //validating status code
		 if(response.getStatusLine().getStatusCode() == 200)
		 {
			 System.out.println("Test pass");
		 }
		 else
		 {
			 System.out.println("Test fail");
		 } 
		 
		 //creating object for entity ...getting user data     
		 HttpEntity entity = response.getEntity();
         if (entity != null) {
             // return it as a String
             String result = EntityUtils.toString(entity);
             System.out.println(result);
         }
		 //String json = EntityUtils.toString(response.getEntity());
		// System.out.println(json);
         
         //getting header content
         Header headers = entity.getContentType();
 		 System.out.println(headers);
		return url;
		}
	}


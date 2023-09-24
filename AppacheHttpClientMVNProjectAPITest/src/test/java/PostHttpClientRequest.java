import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;



public class PostHttpClientRequest {

	
		public static void main(String[] args) throws IOException {

	    	CloseableHttpClient httpClient = HttpClients.createDefault();
	    	 
	    	String url = "https://gorest.co.in/public/v2/users";
	    	
	    	String token="6879dfc387a689ebb193ac7dd112d0c61b5aa6cee294140cf31c0a3b0477f238";
	        
	        HttpPost httppost = new HttpPost(url);

	        httppost.setHeader(HttpHeaders.AUTHORIZATION,"Bearer" +token);
	        

	        // add request parameters or form parameters
	        List<NameValuePair> param = new ArrayList<NameValuePair>();
	        param.add(new BasicNameValuePair("name", "Kiiran KhatkePatil"));
	        param.add(new BasicNameValuePair("email", "kiiran1krishnadasa@heller.co"));
	        param.add(new BasicNameValuePair("gender", "female"));
	        param.add(new BasicNameValuePair("status", "active"));
	    
	        
	        
	        httppost.setEntity(new UrlEncodedFormEntity(param));

	      
	         CloseableHttpResponse response = httpClient.execute(httppost);
	             
	          int statuscode = response.getStatusLine().getStatusCode();
	          System.out.println(statuscode);
	          
	          if(statuscode==201) 
	            {
	            	System.out.println("Test pass");
	            }
	            else
	            {
	            	System.out.println("Test failed");
	            }
	          
	          HttpEntity entity  = response.getEntity();
	          String result = EntityUtils.toString(entity);
	          System.out.println(result);
	            
	          httpClient.close();
	        }
		

	}



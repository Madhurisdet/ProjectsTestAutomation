import java.io.IOException;



import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GetApacheHttpClientBookAPI {

    public static void main(String[] args) throws IOException {
    	
    	CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet request = new HttpGet("https://simple-books-api.glitch.me/books/1");

        CloseableHttpResponse response = httpClient.execute(request) ;
       
            // Get HttpResponse Status
                        
            System.out.println(response.getStatusLine().getStatusCode());   // 200
            System.out.println(response.getStatusLine().getReasonPhrase()); // OK
            System.out.println(response.getStatusLine().toString()); // HTTP/1.1 200 OK

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }
       
            //validation 
            if(response.getStatusLine().getStatusCode()==200)
            {
            	System.out.println("Test passed");
            }
            else 
            {
            	System.out.println("Test failed");
            }
            
            
            if(response.getStatusLine().toString()== "HTTP/1.1 200 OK ")
            {
            	System.out.println("Test passed");
            }
            else 
            {
            	System.out.println("Test failed");
            }
            
            
            if(response.getStatusLine().getReasonPhrase() == "OK ")
            {
            	System.out.println("Test passed");
            }
            else 
            {
            	System.out.println("Test failed");
            }
            
       }

    }



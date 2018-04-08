package com.web_handling;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.rmi.server.ExportException;
import com.myexceptions.WrongAddressException;
/**
 *
 * @author Kamil
 */
public class WebConnections {
    
    private String webPageJson;

    public WebConnections(String user_htpp) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://mercury.postlight.com/parser?url=" + user_htpp);

        httpGet.addHeader("Content-Type", "application/json");
        httpGet.addHeader("x-api-key", "nas1TIcr0O2wterrtc4fQywtufnXNe7HjIH50jeN");

        String feedback = null;

        try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
            HttpEntity entity = response.getEntity();
            Object json = mapper.readValue(EntityUtils.toString(entity), Object.class);
            feedback = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
        } 
        catch (ExportException exception) {
            exception.getStackTrace();
        }
        
        if(feedback.equals(" \"message\" : \"Internal server error\" "))
            throw new WrongAddressException();
        
        webPageJson = feedback;
    }

    public String getWebPageJson() {
        return webPageJson;
    }
}

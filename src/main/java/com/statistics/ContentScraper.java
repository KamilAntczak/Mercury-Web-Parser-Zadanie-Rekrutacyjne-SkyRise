package com.statistics;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.StringReader;


/**
 *
 * @author Kamil
 */
public class ContentScraper {
    
    private String title;
    private String content;
    private String url;

    
    public ContentScraper(String json) throws Exception {
        
        JsonNode rootNode = new ObjectMapper().readTree(new StringReader(json));
        
        JsonNode innerNode = rootNode.get("content");
        content = innerNode.asText();

        innerNode = rootNode.get("title");
        title = innerNode.asText();
        
        innerNode = rootNode.get("url");
        url = innerNode.asText();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    
    public String getUrl() {
        return url;
    }
}
    
 
    
 

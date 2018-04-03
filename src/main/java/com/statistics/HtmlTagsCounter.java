package com.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Kamil
 */
public class HtmlTagsCounter {
    
    private final List<HtmlTag> htmlTags = new ArrayList<>();
    private int tagsOnSingleSite;

    public void scrapContent(String content) {
        Pattern pattern = Pattern.compile("[<]{1}[/]{1}[a-z]{1,}");
        Matcher match = pattern.matcher(content);

        while (match.find()) {
            
            boolean check = true;            
            for (HtmlTag aClassesList : htmlTags) {
                if (aClassesList.tagName.equals(match.group())) {
                    check = false;
                    aClassesList.count = aClassesList.count + 1;
                    tagsOnSingleSite += 1;
                }
            }
            if (check) {
                HtmlTag newTag = new HtmlTag();
                htmlTags.add(newTag);
                newTag.tagName = match.group();
                newTag.count = 1;
                tagsOnSingleSite += 1;
            }
        }
    }

    public List<HtmlTag> getTags() {
        return htmlTags;
    }

    @Override
    public String toString() {
        return htmlTags.toString();
    }
    
    public int getTagsOnSingleSite(){
        int tmp = tagsOnSingleSite;
        tagsOnSingleSite=0;
        return tmp;        
    }
}

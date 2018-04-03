package com.statistics;

/**
 *
 * @author Kamil
 */
public class HtmlTag implements Comparable<HtmlTag>{
    
    public String tagName;
    public Integer count;
    
    @Override
    public int compareTo(HtmlTag o) {
        return o.count - this.count;
    }

    @Override
    public String toString() {
        return "{" + tagName + " = " + count+ "}";
    }
}

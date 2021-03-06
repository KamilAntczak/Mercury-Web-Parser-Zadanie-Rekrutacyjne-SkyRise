/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.statistics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class TopTenTagsCounter {

    private final List<HtmlTag> htmlTagStatistic = new ArrayList<>();
    private int totalTags = 0;

    /**
     * Add the most frequent HTML tags to list. If tag arleady exist on this
     * list, sum up their counts.
     *
     * @param newTagsToAdd List containing statistics of parsed site, tags names
     * and their instances.
     */
    public void addToStatsList(List<HtmlTag> newTagsToAdd) {

        for (HtmlTag toAdd : newTagsToAdd) {

            boolean check = true;
            for (HtmlTag tagFinalStats : htmlTagStatistic) {
                if (tagFinalStats.tagName.equals(toAdd.tagName)) {
                    check = false;
                    tagFinalStats.count = tagFinalStats.count + toAdd.count;
                    break;
                }
            }
            if (check) {
                HtmlTag newTag = new HtmlTag();
                htmlTagStatistic.add(newTag);
                newTag.tagName = toAdd.tagName;
                newTag.count = toAdd.count;                
            }
            totalTags += toAdd.count;
        }
    }

    public List<HtmlTag> getTags() {
        return htmlTagStatistic;
    }

    public String getTopTenTags() {

//        String topTen = null;
        return htmlTagStatistic.subList(0, Math.min(10, htmlTagStatistic.size())).toString();
//        for (int i = 0; i <= 10; i++) {
//            if (htmlTagStatistic.size() >= i) {
//                topTen = htmlTagStatistic.subList(0, i).toString();
//            }
//        }
        //return topTen;
    }

    public int getTotalTags() {
        return totalTags;
    }

}

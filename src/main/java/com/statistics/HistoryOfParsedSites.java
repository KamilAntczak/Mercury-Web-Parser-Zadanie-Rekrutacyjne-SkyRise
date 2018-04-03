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
public class HistoryOfParsedSites {
    
    private final List<ParsedWebSite> parsedSite = new ArrayList<>();
    
    public void addToHistory(String address, String title, String tags)
    {
       ParsedWebSite newSite = new ParsedWebSite();
       parsedSite.add(0,newSite);
       newSite.address = address;
       newSite.title = title;
       newSite.htmlResults = tags;
    }
    
    public String getAddress(int index)
    {
        String address;
        if(parsedSite.size()-1 >= index){
        address = parsedSite.get(index).address;
        return address;
        }
        else
            return null;
    }
     
    @Override
    public String toString() {
        return parsedSite.toString();
    }
       
    public int getSizeOfHistory(){
        return parsedSite.size();
    }
}

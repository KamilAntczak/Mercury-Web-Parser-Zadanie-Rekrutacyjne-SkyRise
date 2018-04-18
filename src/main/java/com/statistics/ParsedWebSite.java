/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.statistics;

/**
 *
 * @author Kamil
 */
public class ParsedWebSite {

    private final String address;
    private final String title;
    private final String htmlResults;

    public ParsedWebSite(String address, String title, String htmlResults) {
        this.address = address;
        this.title = title;
        this.htmlResults = htmlResults;
    }

    
    
    @Override
    public String toString() {
        return title + " - " + address + System.lineSeparator() + htmlResults + System.lineSeparator() + System.lineSeparator();
    }
}

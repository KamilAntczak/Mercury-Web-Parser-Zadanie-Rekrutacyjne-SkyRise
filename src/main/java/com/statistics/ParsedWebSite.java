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
    public String address;
    public String title;
    public String htmlResults;
    
@Override
    public String toString() {
        return title + " - " + address + System.lineSeparator() +htmlResults + System.lineSeparator()+ System.lineSeparator();
    }
}

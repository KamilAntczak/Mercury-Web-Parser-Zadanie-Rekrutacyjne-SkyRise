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

    /**
     * Add website to List of parsed Web Sites
     *
     * @param address an absolute URL String
     * @param title an title of parsed website String
     * @param tags String of every HTML Tag
     */
    public void addToHistory(String address, String title, String tags) {
        parsedSite.add(0, new ParsedWebSite(address, title, tags));
    }

    @Override
    public String toString() {
        return parsedSite.toString();
    }

    public int getSizeOfHistory() {
        return parsedSite.size();
    }
}

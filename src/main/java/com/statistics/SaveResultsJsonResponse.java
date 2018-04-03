/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.statistics;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author Kamil
 */
public class SaveResultsJsonResponse {
    
    public void saveResults(String pageContent)
    {
   
         JFileChooser fileChooser = new JFileChooser();                
        if(JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(null))
        {
            File file = fileChooser.getSelectedFile();
            try{
                HtmlTagsCounter htmlTagsCounter = new HtmlTagsCounter();
                htmlTagsCounter.scrapContent(pageContent);
                htmlTagsCounter.getTags().sort(HtmlTag::compareTo);
               
                FileWriter fileWriter = new FileWriter(file.getPath());
                fileWriter.write(htmlTagsCounter.toString());
                fileWriter.flush();
                fileWriter.close();
            }
            catch(Exception exception)
            {}
        }
    }
}

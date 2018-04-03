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
public class SaveTopTenTags {
    
     /**
    * Save the top ten html tags to the .txt file.
    *
    * @param topTen String containing statistic about most frequent html tags.
    */
    public void saveTopTenResults(String topTen)
    {
   
        JFileChooser fileChooser = new JFileChooser();                
        if(JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(null))
        {
            File file = fileChooser.getSelectedFile();
            try{              
                FileWriter fileWriter = new FileWriter(file.getPath());
                fileWriter.write(topTen);
                fileWriter.flush();
                fileWriter.close();
            }
            catch(Exception exception)
            {}
        }
    }
}

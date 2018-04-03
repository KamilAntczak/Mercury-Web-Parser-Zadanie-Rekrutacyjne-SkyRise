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

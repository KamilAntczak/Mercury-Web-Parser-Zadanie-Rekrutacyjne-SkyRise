/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.statistics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Kamil
 */
public class SaveChoosenStat {
    
     /**
    * Save the top ten html tags to the .txt file.
    *
    * @param toSave put String to save.
    */
    public void saveStat(String toSave)
    {
   
        JFileChooser fileChooser = new JFileChooser();                
        if(JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(null))
        {
            File file = fileChooser.getSelectedFile();
            try (FileWriter fileWriter = new FileWriter(file.getPath())) {              
                fileWriter.write(toSave);
                fileWriter.flush();
            }
            catch(IOException exception)
            {}
        }
    }
    
}

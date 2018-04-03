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
public class SaveFullJsonResponse {
    
    public void saveResponse(String pageJson){
          JFileChooser fileChooser = new JFileChooser();        
      
        if(JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(null))
        {
            File file = fileChooser.getSelectedFile();
            try{
                FileWriter fileWriter = new FileWriter(file.getPath());
                fileWriter.write(pageJson);
                fileWriter.flush();
                fileWriter.close();
            }
            catch(IOException exception)
            {}
        }
    
    }
}
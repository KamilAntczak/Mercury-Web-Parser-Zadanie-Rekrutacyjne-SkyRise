/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexceptions;

/**
 *
 * @author Kamil
 */
public class WrongAddressException extends Exception {
    
    public WrongAddressException(){       
    }
    
    public void returnError()
    {
    System.out.println("Invalid Address");
    }
}

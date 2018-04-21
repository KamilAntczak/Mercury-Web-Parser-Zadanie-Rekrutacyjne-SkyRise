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
public class AddressExceptions extends Exception {

    public AddressExceptions() {
    }

    public String returnAddresError() {
        return "Invalid Address";
    }
    
    public String cantParse() {
        return "This site cannot be parsed";
    }
}

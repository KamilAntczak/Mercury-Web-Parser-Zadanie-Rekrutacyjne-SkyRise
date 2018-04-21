/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webhandling.test;

import com.myexceptions.AddressExceptions;
import com.web_handling.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kamil
 */
public class TestAddressValidator {
    
    AddressValidator AddressValidator;
    
    @Test
    public void testAddressValidation(){ 
        AddressValidator = new AddressValidator();
        
        try{
            AddressValidator.check("www.example.com");
            fail("exception - no http://");
        }
        catch(AddressExceptions e){
        }
        
        try{
            AddressValidator.check("http://example.com");
            fail("exception - no www");
        }
        catch(AddressExceptions e){
        }
        
         try{
            AddressValidator.check("http//www.example.com");
            fail("exception - no :");
        }
        catch(AddressExceptions e){
        }
         
         try{
            AddressValidator.check("");
            fail("empty address");
        }
        catch(AddressExceptions e){
        }
    }
    
}

package com.web_handling;

import com.myexceptions.AddressExceptions;

/**
 *
 * @author Kamil
 */
public class AddressReader {

    /**
     * Take addres from a textbox and validate
     *
     * @param addressValidator checks if addres is proper.
     * @param givenAddres address given by user
     */
    public static String readAddres(AddressValidator addressValidator, String givenAddres) throws AddressExceptions {
        String webPage = givenAddres;
        if (!givenAddres.isEmpty() && addressValidator.check(webPage)) {
            return webPage;            
        } 
        else {
            throw new AddressExceptions();
        }
    }
}

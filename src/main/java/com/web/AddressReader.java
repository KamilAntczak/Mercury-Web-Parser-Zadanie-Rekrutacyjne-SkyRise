package com.web;
import com.myexceptions.WrongAddressException;

/**
 *
 * @author Kamil
 */
public class AddressReader {

    public static String readAddres(AddressValidator addressValidator, String givenAddres) throws WrongAddressException {
        String webPage = givenAddres;
        if (addressValidator.check(webPage) && !givenAddres.isEmpty())
        return webPage;
        
        else {
            throw new WrongAddressException();
        }
    
    }
}

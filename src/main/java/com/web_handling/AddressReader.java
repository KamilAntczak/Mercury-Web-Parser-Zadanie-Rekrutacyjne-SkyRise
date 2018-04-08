package com.web_handling;

import com.myexceptions.WrongAddressException;

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
    public static String readAddres(AddressValidator addressValidator, String givenAddres) throws WrongAddressException {
        String webPage = givenAddres;
        if (addressValidator.check(webPage) && !givenAddres.isEmpty()) {
            return webPage;
        } else {
            throw new WrongAddressException();
        }

    }
}

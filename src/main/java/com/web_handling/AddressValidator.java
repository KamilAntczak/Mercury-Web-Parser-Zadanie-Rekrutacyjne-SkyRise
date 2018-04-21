package com.web_handling;

import com.myexceptions.AddressExceptions;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class AddressValidator {

    private static final List<String> requirements = new ArrayList<String>() {
        {
            add("http");
            add("www.");
            add("://");
        }
    };

    public boolean check(String stringAddress) throws AddressExceptions {
        for (String requirement : requirements) {
            if (!stringAddress.contains(requirement)) {
                System.out.println("ERROR: Missing " + requirement);
                throw new AddressExceptions();
            }
        }
        return true;
    }
}

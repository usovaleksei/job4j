package stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class collect users addresses to list
 * @author Aleksei Usov
 * @since 04/11/2020
 */

public class Profiles {

    /**
     * method collect users addresses from user profile to list
     * @param profiles - list of users profiles
     * @return addresses list
     */
   public List<Address> collect(List<Profile> profiles) {
        List<Address> addresses =
                      profiles.stream()
                              .map(Profile :: getAddress)
                              .collect(Collectors.toList());
        return addresses;
    }
}

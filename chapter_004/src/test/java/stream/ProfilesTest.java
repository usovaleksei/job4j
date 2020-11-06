package stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    private List<Profile> userList = new ArrayList<>();

    @Before
    public void setUp() {
        userList.add(new Profile(new Address("Moscow", "Zvezdnaya", 10, 15)));
        userList.add(new Profile(new Address("Moscow", "Planetnaya", 7, 208)));
        userList.add(new Profile(new Address("Balashiha", "Sverdlova", 21, 7)));
        userList.add(new Profile(new Address("Moscow", "Zvezdnaya", 10, 15)));
    }

    @Test
    public void whenCollectAddressToList() {
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(userList);
        List<Address> expected = List.of(
                new Address("Balashiha", "Sverdlova", 21, 7),
                new Address("Moscow", "Zvezdnaya", 10, 15),
                new Address("Moscow", "Planetnaya", 7, 208));
        assertThat(result, is(expected));
    }
}

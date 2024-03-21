package org.tests.dataProvider;

import org.models.UserRunner;
import org.testng.annotations.DataProvider;
import org.models.User;
import java.util.Collections;

public class DataProviderClass {

    @DataProvider(name = "usersWithLastNameStartingWithSOrA")
    public Object[][] usersWithLastNameStartingWithSOrAData() {
        // Test data for parameterized test
        return new Object[][] {
                {UserRunner.createUserList(), false}, // User with last name starting with "S"
                {UserRunner.createUserList(), true}   // User with last name starting with "A"
        };
    }


}

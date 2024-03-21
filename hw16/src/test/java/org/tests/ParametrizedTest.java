package org.tests;

import org.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utils.UserOperationsImpl;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;


public class ParametrizedTest extends BaseTest {

//    private UserOperationsImpl userOperations;

    @Test(dataProvider = "usersWithLastNameStartingWithSOrA", dataProviderClass = org.tests.dataProvider.DataProviderClass.class)
    public void testCheckIfUsersHaveLastNameStartingWithSOrA_Parametrized(List<User> users, boolean expectedResult) {
        UserOperationsImpl userOperations = new UserOperationsImpl();

        userOperations.execute(users);

        Assert.assertEquals(userOperations.checkIfUsersHaveLastNameStartingWithSOrA(users), expectedResult);
    }
}

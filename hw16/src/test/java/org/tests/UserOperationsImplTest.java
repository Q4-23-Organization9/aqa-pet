package org.tests;

import org.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utils.UserOperationsImpl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class UserOperationsImplTest extends BaseTest {

    private List<User> users;

    @Test
    public void testSortByAge_1() {
        List<User> users = createUserList();

        UserOperationsImpl userOperations = new UserOperationsImpl();
        userOperations.sortByAge(users);

        for (int i = 0; i < users.size() - 1; i++) {
            Assert.assertTrue(users.get(i).getAge() <= users.get(i + 1).getAge());
        }
    }
    @Test
    public void testSortByAge_2() {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Alice", "Smith", 30),
                new User("Sophia", "Martinez", 20)
        );


        UserOperationsImpl userOperations = new UserOperationsImpl();
        userOperations.sortByAge(users);


        for (int i = 0; i < users.size() - 1; i++) {
            assertTrue(users.get(i).getAge() <= users.get(i + 1).getAge());
        }
    }

    @Test
    public void testCalculateAverageAge_1() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        double expectedAverageAge = 27.6;
        double actualAverageAge = userOperations.calculateAverageAge(users);
        Assert.assertEquals(actualAverageAge, expectedAverageAge, 0.01);
    }
    @Test
    public void testCalculateAverageAge_2() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        double expectedAverageAge = 31.8;
        double actualAverageAge = userOperations.calculateAverageAge(users);
        Assert.assertEquals(actualAverageAge, expectedAverageAge, 0.01);
    }

    @Test
    public void testSortByMultipleProperties_1() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        userOperations.sortByMultipleProperties(users);

        for (int i = 0; i < users.size() - 1; i++) {
            User current = users.get(i);
            User next = users.get(i + 1);

            int compareResult = current.getFirstName().compareTo(next.getFirstName());
            if (compareResult == 0) {
                assertTrue(current.getAge() <= next.getAge());
            } else {
                assertTrue(compareResult < 0);
            }
        }
    }
    @Test
    public void testSortByMultipleProperties_2() {
        List<User> users = Arrays.asList(
                new User("Alice", "Smith", 30),
                new User("John", "Doe", 25),
                new User("Sophia", "Martinez", 20)
        );


        UserOperationsImpl userOperations = new UserOperationsImpl();
        userOperations.sortByMultipleProperties(users);


        for (int i = 0; i < users.size() - 1; i++) {
            User current = users.get(i);
            User next = users.get(i + 1);

            int compareResult = current.getFirstName().compareTo(next.getFirstName());
            if (compareResult == 0) {
                assertTrue(current.getAge() <= next.getAge());
            } else {
                assertTrue(compareResult < 0);
            }
        }
    }

    @Test
    public void testCheckUserLastNameOperation_1() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        List<User> users = Arrays.asList(
                new User("John", "Soe", 25),
                new User("Alice", "Smith", 30),
                new User("Sophia", "Artinez", 13)
        );
        boolean result = userOperations.checkIfUsersHaveLastNameStartingWithSOrA(users);
        assertTrue(result, "All users' last names should start with 'S' or 'A'");
    }
    @Test
    public void testCheckUserLastNameOperation_2() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        List<User> users = Arrays.asList(
                new User("John", "Smith", 25),
                new User("Alice", "Adams", 30),
                new User("Emma", "Saylor", 28)
        );
        boolean result = userOperations.checkIfUsersHaveLastNameStartingWithSOrA(users);
        assertTrue(result, "All users' last names should start with 'S' or 'A'");
    }

    @Test
    public void testCheckUserAgeOperation_1() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Alice", "Smith", 30),
                new User("Sophia", "Martinez", 43)
        );
        boolean result = userOperations.checkIfAllUsersAreOver18(users);
        assertTrue(result, "All users should be over 18 years old");
    }
    @Test
    public void testCheckUserAgeOperation_2() {
        UserOperationsImpl userOperations = new UserOperationsImpl();
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Alice", "Smith", 30),
                new User("Sophia", "Martinez", 21)
        );
        boolean result = userOperations.checkIfAllUsersAreOver18(users);
        assertTrue(result, "All users should be over 18 years old");
    }

    @Test
    public void testCheckIfUsersHaveLastNameStartingWithSOrA_EmptyList() {
        userOperations = new UserOperationsImpl();
        List<User> users = Collections.emptyList();

        boolean result = userOperations.checkIfUsersHaveLastNameStartingWithSOrA(users);

        assertTrue(result, "Expected result should be true for null or empty list");
    }

    public static List<User> createUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Doe", 25));
        users.add(new User("Alice", "Smith", 30));
        users.add(new User("James", "Brown", 40));
        users.add(new User("Michael", "Johnson", 35));
        users.add(new User("Emma", "Taylor", 28));

        return users;
    }


}

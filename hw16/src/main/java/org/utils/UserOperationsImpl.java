package org.utils;

import org.models.User;
import org.models.UserOperations;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class UserOperationsImpl implements UserOperations {
    private static final Logger logger = Logger.getLogger(UserOperationsImpl.class.getName());
    @Override
    public void execute(List<User> users) {
        calculateAverageAge(users);
        checkIfAllUsersAreOver18(users);
        checkIfUsersHaveLastNameStartingWithSOrA(users);
        sortByAge(users);
        sortByMultipleProperties(users);
    }

    public double calculateAverageAge(List<User> users) {
        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        logger.info("Average age: " + averageAge);
        return averageAge;
    }

    public boolean checkIfAllUsersAreOver18(List<User> users) {
        boolean allUsersAreOver18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        logger.info("All users are over 18: " + allUsersAreOver18);
        return allUsersAreOver18;
    }

    public boolean checkIfUsersHaveLastNameStartingWithSOrA(List<User> users) {
        boolean hasUsersWithLastNameSOrA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        logger.info("Users with last name starting with S or A: " + hasUsersWithLastNameSOrA);
        return hasUsersWithLastNameSOrA;
    }

    public void sortByAge(List<User> users) {
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        logger.info("Sorted by age: " + sortedUsers);

    }

    public void sortByMultipleProperties(List<User> users) {
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFirstName)
                        .thenComparingInt(User::getAge))
                .collect(Collectors.toList());
        logger.info("Sorted by first name and age: " + sortedUsers);
    }
}

package hw13.task3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByMultiplePropertiesOperation implements UserOperations {

    @Override
    public void execute(List<User> users) {

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFirstName)
                        .thenComparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by first name and age: " + sortedUsers);
    }


}

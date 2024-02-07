package hw13.task3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByAgeOperation implements UserOperations {

    @Override
    public void execute(List<User> users) {

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by age: " + sortedUsers);
    }


}

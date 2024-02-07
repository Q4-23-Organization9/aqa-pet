package hw13.task3;

import java.util.List;

public class CalculateAverageAgeOperation implements UserOperations {

    @Override
    public void execute(List<User> users) {

        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age: " + averageAge);
    }


}

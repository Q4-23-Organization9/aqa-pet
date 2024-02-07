package hw13.task3;

import java.util.List;

public class CheckUserAgeOperation implements UserOperations {

    @Override
    public void execute(List<User> users) {

        boolean allUsersAreOver18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println("All users are over 18: " + allUsersAreOver18);
    }


}

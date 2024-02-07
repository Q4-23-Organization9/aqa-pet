package hw13.task3;

import java.util.List;

public class CheckUserLastNameOperation implements UserOperations {

    @Override
    public void execute(List<User> users) {
        // Проверка фамилии пользователей
        boolean hasUsersWithLastNameSOrA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        System.out.println("Users with last name starting with S or A: " + hasUsersWithLastNameSOrA);
    }


}

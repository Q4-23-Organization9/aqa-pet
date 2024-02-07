package hw13.task3;


import java.util.ArrayList;
import java.util.List;
public class UserRunner {

    public static void main(String[] args) {
        List<User> users = createUserList();

        executeOperation(new SortByAgeOperation(), users);
        executeOperation(new CalculateAverageAgeOperation(), users);
        executeOperation(new SortByMultiplePropertiesOperation(), users);
        executeOperation(new CheckUserLastNameOperation(), users);
        executeOperation(new CheckUserAgeOperation(), users);
    }


    private static List<User> createUserList() {
        List<User> users = new ArrayList<>();

        users.add(new User("John", "Doe", 25));
        users.add(new User("James", "Smith", 5));
        users.add(new User("Alexander", "Johnson", 15));
        users.add(new User("Christopher", "Brown", 18));
        users.add(new User("Michael", "Taylor", 17));
        users.add(new User("Alice", "Smith", 30));
        users.add(new User("Emily", "Johnson", 3));
        users.add(new User("Sophia", "Martinez", 13));
        users.add(new User("Olivia", "Clark", 23));
        users.add(new User("Ava", "Rodriguez", 39));

        return users;
    }


    private static void executeOperation(UserOperations operation, List<User> users) {
        operation.execute(users);
    }


}

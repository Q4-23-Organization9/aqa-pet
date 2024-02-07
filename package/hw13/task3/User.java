package hw13.task3;

public class User {

    private String firstName;
    private String secondName;
    private int age;


    public User(String firstName, String secondName, int age) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
    }



    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }


    public void setSecondName(String secondName) {
        if (secondName == null || secondName.isEmpty()) {
            throw new IllegalArgumentException("Second name cannot be null or empty");
        }
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }


}

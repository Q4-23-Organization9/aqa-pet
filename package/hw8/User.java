package hw8;

public class User {

    public String userName;
    public String email;
    public boolean isActive;
    public double amountSpentMoney;

    private String password;
    private int age;

    // password
    public void setPassword(String userPassword) {
        if (userPassword != null && !userPassword.isEmpty()) {
            password = userPassword;
        } else {
            System.out.println("Incorrect password");
        }
    }
    public String getPassword() {

        return password;
    }

    // age
    public void setAge(int userAge) {
        if (userAge > 0) {
            age = userAge;
        } else {
            System.out.println("Invalid age value");
        }
    }
    public int getAge() {
        return age;
    }

    // Метод makePurchase.
    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase made for: " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }
    // Метод printTotalAmountOfSpentMoney.
    public void printTotalAmountOfSpentMoney() {

        System.out.println("Total amount of money spent: " + amountSpentMoney);
    }

    // 1. Дефолтний конструктор (без параметрів).
    public User() {

    }

    // 2. Конструктор, який приймає userName.
    public User(String userName) {
        this.userName = userName;

    }

    // 3. Конструктор, який приймає userName та password.
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // 4. Конструктор, який приймає userName, password, age, email.
    public User(String userName, String password, int age, String email) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    // Метод для виведення даних користувача 1
    public void printUserInfo1() {

    }
    // Метод для виведення даних користувача 2
    public void printUserInfo2() {
        System.out.println("the second user's name is " + userName);
    }
    // Метод для виведення даних користувача 3
    public void printUserInfo3() {
        System.out.println("the third user's name is " + userName + " and password is " + password);
    }
    // Метод для виведення даних користувача 4
    public void printUserInfo4() {
        System.out.println("the fourth user's name is " + userName + " , she is " + age + " years old");
        System.out.println("password is " + password + " , email is " + email);
    }

}

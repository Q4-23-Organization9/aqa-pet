package hw8;

public class User {

    public String userName;
    public String email;
    public boolean isActive;
    public double amountSpentMoney;

    private String password;
    private int age;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;

    }


    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public User(String userName, String password, int age, String email) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.email = email;
    }

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


    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase made for: " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {

        System.out.println("Total amount of money spent: " + amountSpentMoney);
    }


    public void printUserInfo1() {

    }

    public void printUserInfo2() {
        System.out.println("the second user's name is " + userName);
    }
    // Метод для виведення даних користувача 3
    public void printUserInfo3() {
        System.out.println("the third user's name is " + userName + " and password is " + password);
    }

    public void printUserInfo4() {
        System.out.println("the fourth user's name is " + userName + " , she is " + age + " years old");
        System.out.println("password is " + password + " , email is " + email);
    }

}

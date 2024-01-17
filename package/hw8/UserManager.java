package hw8;

public class UserManager {

    public static void main(String[] args) {

        User firstUser = new User();

        User secondUser = new User("Alice");

        User thirdUser = new User("Olha", "MYpassword");

        User fourthUser = new User("Ann", "herPassword", 25, "hjkh@gmail.com");


        System.out.println("Info 1:");
        firstUser.printUserInfo1();
        firstUser.makePurchase(50.60);
        firstUser.makePurchase(40.60);
        firstUser.printTotalAmountOfSpentMoney();
        System.out.println("-----------------------------------------------------------");

        System.out.println("Info 2:");
        secondUser.printUserInfo2();
        secondUser.makePurchase(75.5);
        secondUser.makePurchase(15.5);
        secondUser.printTotalAmountOfSpentMoney();
        System.out.println("-----------------------------------------------------------");

        System.out.println("Info 3:");
        thirdUser.printUserInfo3();
        thirdUser.makePurchase(30.12);
        thirdUser.makePurchase(300.12);
        thirdUser.printTotalAmountOfSpentMoney();
        System.out.println("-----------------------------------------------------------");

        System.out.println("Info 4:");
        fourthUser.printUserInfo4();
        fourthUser.makePurchase(20.12);
        fourthUser.makePurchase(200.12);
        fourthUser.printTotalAmountOfSpentMoney();
        System.out.println("-----------------------------------------------------------");


    }

}

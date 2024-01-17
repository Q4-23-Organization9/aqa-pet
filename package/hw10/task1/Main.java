package hw10.task1;

public class Main {

    public static void main(String[] args) {

        MobilePhoneAbstractClass phone = new Model("Samsung", "Galaxy S21");
        phone.turnOn();
        phone.call("+421 909 238 449");
        phone.sendMessage("+421 909 238 449", "Hello, how are you?");
        phone.turnOff();

    }

}


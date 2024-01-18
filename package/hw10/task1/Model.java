package hw10.task1;

public class Model extends MobilePhoneAbstractClass{

    public Model(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " using " + getBrand() + " " + getModel());
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + " from " + getBrand() + " " + getModel() + ": " + message);
    }


}

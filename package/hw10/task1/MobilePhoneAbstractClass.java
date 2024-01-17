package hw10.task1;

public abstract class MobilePhoneAbstractClass implements MobileInterface{

    private String brand;
    private String model;

    public MobilePhoneAbstractClass(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the " + brand + " " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the " + brand + " " + model);
    }

}

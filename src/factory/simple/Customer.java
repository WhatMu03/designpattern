package factory.simple;

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createCar(0);
        factory.createCar(1);
    }
}

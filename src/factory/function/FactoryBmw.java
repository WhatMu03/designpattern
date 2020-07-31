package factory.function;

public class FactoryBmw implements Factory {
    @Override
    public Bmw createCar(){
        return new Bmw();
    }
}

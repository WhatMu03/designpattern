package factory.function;

public class FactoryBen implements Factory {
    @Override
    public Ben createCar(){
        return new Ben();
    }
}

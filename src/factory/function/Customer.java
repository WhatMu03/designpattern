package factory.function;

public class Customer {
    public static void main(String[] args) {
        //创建宝马车
        FactoryBmw factoryBmw = new FactoryBmw();
        factoryBmw.createCar();
        //创建奔驰车
        FactoryBen factoryBen = new FactoryBen();
        factoryBen.createCar();
    }

}

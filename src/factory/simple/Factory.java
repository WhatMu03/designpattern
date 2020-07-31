package factory.simple;

public class Factory {
    public Car createCar(int type){
        switch (type){
            case 0 :
                return new Bmw();
            case 1:
                return new Ben();
            default:break;
        }
        return null;
    }
}

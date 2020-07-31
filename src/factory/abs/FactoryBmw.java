package factory.abs;

public class FactoryBmw implements Factory {
    @Override
    public Engine createEngine(){
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition(){
        return new AirconditionB();
    }
}

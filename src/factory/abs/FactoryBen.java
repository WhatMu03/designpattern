package factory.abs;

public class FactoryBen implements Factory {
    @Override
    public Engine createEngine(){
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition(){
        return new AirconditionA();
    }
}

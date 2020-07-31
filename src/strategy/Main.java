package strategy;

public class Main {
    public static void main(String[] args) {
        Calulator calulator = new Calulator();
        //+
        calulator.setOperation(new OperationAdd());
        System.out.println(calulator.doCalulator(1, 2));
        //-
        calulator.setOperation(new OperationSub());
        System.out.println(calulator.doCalulator(1, 2));
    }
}

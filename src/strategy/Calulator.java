package strategy;

public class Calulator {
    private Operation operation;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doCalulator(int num1, int num2){
        return operation.doOperation(num1, num2);
    }
}

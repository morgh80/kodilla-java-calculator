package pl.aeronaut.calculator;

public class AddOperation implements BinaryOperation {

    public Double doBinaryOperation(Double a, Double b) {
        Double result = a.doubleValue() + b.doubleValue();
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }
}
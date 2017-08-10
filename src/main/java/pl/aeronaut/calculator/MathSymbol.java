package pl.aeronaut.calculator;

import java.util.ArrayList;

public class MathSymbol {

    private ArrayList<String> binaryOperations;

    public MathSymbol() {
        binaryOperations = new ArrayList<>();
        binaryOperations.add("+");
        binaryOperations.add("-");
        binaryOperations.add("*");
        binaryOperations.add("/");
    }

    public ArrayList<String> gerBinaryOperationSymbol() {
       return binaryOperations;
    }


}

package pl.aeronaut.calculator;

import java.util.ArrayList;

public class CalculatorDeserializer {
    MathSymbol mathSymbol = new MathSymbol();

    public void convertToArrays(String input) {
        int counter = 0;
        String stringValue = "";
        Double valueA;
        Double valueB;
        String operator;

        char[] characterArray = input.toCharArray();
        ArrayList<Double> valueArray = new ArrayList<>();
        ArrayList<String> operatorArray = new ArrayList<>();

        for (Character character : characterArray) {
            if (Character.isDigit(character)) {
                stringValue += character.toString();

                if (characterArray[counter + 1] == ' ' || counter == characterArray.length - 1) {
                    valueA = Double.valueOf(stringValue);
                    valueArray.add(valueA);
                    stringValue = "";
                }
            }
            if (mathSymbol.gerBinaryOperationSymbol().contains(character.toString())) {
                operator = character.toString();
                operatorArray.add(operator);
            }
            counter++;
        }
        System.out.println("test");
        for (Double x : valueArray) {
            System.out.println("value " + x);
        }
        for (String y : operatorArray) {
            System.out.println("operator " + y);
        }

    }

}

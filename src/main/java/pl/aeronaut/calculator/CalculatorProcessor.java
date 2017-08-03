package pl.aeronaut.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CalculatorProcessor {

    private CalculatorFunctions functions = new CalculatorFunctions();
    private Double result;
    private HashMap<Integer, String> calculatorFunctions;
    private Scanner userInput = new Scanner(System.in);
    private CalculatorMemory memory = new CalculatorMemory();

    public CalculatorProcessor() {
        calculatorFunctions = new HashMap<>();
        calculatorFunctions.put(1, "add");
        calculatorFunctions.put(2, "subtract");
        calculatorFunctions.put(3, "multiply");
        calculatorFunctions.put(4, "divide");
        calculatorFunctions.put(5, "calculate percentage");
        calculatorFunctions.put(6, "power");
        calculatorFunctions.put(7, "square root");
        calculatorFunctions.put(8, "divide one by number");
        calculatorFunctions.put(9, "add to memory");
        calculatorFunctions.put(10, "get from memory");
        calculatorFunctions.put(11, "clear memory");
    }


    public void startCalculator() {
        result = functions.getResult(); // wygląda dziwnie na początku tej metody, ale w ten sposób zachowuję ostatni rezultat, na wypadek gdybym chcial go dodad do pamieci (addToMemory)
        System.out.println("What do you want to do?");
        for (Map.Entry<Integer, String> function : calculatorFunctions.entrySet()) {
            System.out.println(function.getKey() + ". " + function.getValue());
        }
        calculate();
    }

    private Boolean isNumber(String value) {
        Boolean isNumber = true;
        for (Character character : value.toCharArray()) {
            if (!Character.isDigit(character)) {
                if (character == '.') {
                    isNumber = true;
                } else {
                    isNumber = false;
                }
            }
        }
        return isNumber;
    }

    private Double getValue() {
        System.out.println("Enter value");
        String value = userInput.next();
        if (!isNumber(value)) {
            System.out.println("Please enter valid number");
            startCalculator();
        }
        return Double.valueOf(value);
    }

    private void calculate() {
        String answer = userInput.next();
        switch (answer) {
            case "1":
                functions.add(getValue(), getValue());
                break;
            case "2":
                functions.substract(getValue(), getValue());
                break;
            case "3":
                functions.multiply(getValue(), getValue());
                break;
            case "4":
                functions.divide(getValue(), getValue());
                break;
            case "5":
                functions.calculatePercentage(getValue(), getValue());
                break;
            case "6":
                functions.power(getValue());
                break;
            case "7":
                functions.squareRoot(getValue());
                break;
            case "8":
                functions.divideOneBy(getValue());
                break;
            case "9":
                memory.addToMemory(result);
                break;
            case "10":
                memory.getFromMemory();
                break;
            case "11":
                memory.clearMemory();
                break;
            default:
                System.out.println("Wrong command");
        }
        startCalculator();
    }

}

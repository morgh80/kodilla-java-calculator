package pl.aeronaut.calculator;

import java.util.LinkedList;
import java.util.Scanner;

public class CalculatorMemory {

    private LinkedList<Double> memory = new LinkedList<>();
    private Double result;

    public void addToMemory(Double result) {
        if (result != null) {
            memory.add(result);
            System.out.println("You have successfully added " + result + " to the memory.");
        } else {
            System.out.println("You have no value to add to the memory");
        }
    }

    public Double getFromMemory() {
        if (memory.isEmpty()) {
            System.out.println("You have no values in the memory");
        } else {
            Integer index = 0;
            Scanner userInput = new Scanner(System.in);
            System.out.println("Values in the memory:");
            for (Double memoryValue : memory) {
                System.out.println(index + ". " + memoryValue);
                index += 1;
            }
            System.out.println("Enter the index:");
            Integer i = userInput.nextInt();
            result = memory.get(i);
            System.out.println("Your value is: " + result);
        }
        System.out.println(memory.size());
        return result;
    }

    public void clearMemory() {
        memory.removeAll(memory);
        System.out.println("Memory is empty");
    }
}
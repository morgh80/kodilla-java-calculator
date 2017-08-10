package pl.aeronaut.calculator;

public class CalculatorApplication {

    public static void main(String[] args) {

        CalculatorProcessor calculatorProcessor = new CalculatorProcessor();
//		calculatorProcessor.startCalculator();

        CalculatorDeserializer calculatorDeserializer = new CalculatorDeserializer();
        calculatorDeserializer.convertToArrays("739 + 62 - 17 z");
        String tem = "";
//		Character.isDigit(tem);
    }
}

package pl.aeronaut.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		CalculatorProcessor calculatorProcessor = new CalculatorProcessor();
		calculatorProcessor.startCalculator();

	}
}

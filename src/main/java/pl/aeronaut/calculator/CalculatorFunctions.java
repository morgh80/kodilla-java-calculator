package pl.aeronaut.calculator;

class CalculatorFunctions {

    private Double result;

    public Double getResult() {
        return result;
    }


    public Double add(Number a, Number b) {
        result = a.doubleValue() + b.doubleValue();
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    public Double substract(Number a, Number b) {
        result = a.doubleValue() - b.doubleValue();
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    public Double multiply(Number a, Number b) {
        result = a.doubleValue() * b.doubleValue();
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    public Double divide(Number a, Number b) {
        result = a.doubleValue() / b.doubleValue();
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    public Double calculatePercentage(Number a, Number percent) {
        result = a.doubleValue() * (percent.doubleValue() * 0.01);
        System.out.println(a + " * " + percent + "% = " + Math.round(result));
        return result;
    }

    public Double power(Number a) {
        result = Math.pow(a.doubleValue(), 2);
        System.out.println("Power of " + a + " = " + result);
        return result;
    }

    public Double squareRoot(Number a) {
        result = Math.sqrt(a.doubleValue());
        System.out.println("Square root of " + a + " = " + result);
        return result;
    }

    public Double divideOneBy(Number a) {
        result = 1 / a.doubleValue();
        System.out.println("1 divided by " + a + " = " + result);
        return result;
    }

}

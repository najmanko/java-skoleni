package cz.adastra.primitives;

public class Calculator {

    private double actual = 0;

    public static void main(String[] args) {
        System.out.println("This is calculator");

        Calculator calculator = new Calculator();
        calculator.plus(8);
        calculator.minus(5);
        calculator.multiplication(4);
        calculator.divide(7);

        System.out.println(calculator.getActual());
    }

    public double getActual() {
        return this.actual;
    }

    public void plus(int number) {
        printCalculation("+", number);
        this.actual = this.actual + number;
        printResult();
    }

    public void minus(int number) {
        //this.actual = this.actual - number;
        printCalculation("-", number);
        this.actual -= number;
        printResult();
    }

    public void multiplication(int number) {
        printCalculation("*", number);
        this.actual *= number;
        printResult();
    }

    public void divide(int number) {
        printCalculation("/", number);
        this.actual /= number;
        printResult();
    }

    private void printCalculation(String character, int number) {
        System.out.print(String.format("%s %s %s", this.actual, character, number));
    }

    private void printResult() {
        System.out.println(" = " + this.actual);
    }
}

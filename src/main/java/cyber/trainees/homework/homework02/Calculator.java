package cyber.trainees.homework.homework02;

import java.util.List;

public class Calculator {
    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;

    public Calculator(Addition addition, Subtraction subtraction, Multiplication multiplication, Division division) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public void printCalculations() {
        int additionResult = addition.add(3, 8);
        System.out.println("3 + 8 = " + additionResult);

        double subtractionResult = subtraction.subtract(3.9, 1.1);
        System.out.println("3.9 - 1.1 = " + subtractionResult);

        int multiplicationResult = multiplication.multiply(3, 6);
        System.out.println("3 * 6 = " + multiplicationResult);

        double divisionResult = division.divide(10, 2);
        System.out.println("10 / 2 = " + divisionResult);
    }
    public void printDoubleResult(List<Double> doubleList) {
        Double result = 0.0;
        for (Double number : doubleList) {
            result = addition.add(number, result);
        }
        System.out.println(result);
    }

    public void printIntsResult(List<Integer> integerList) {
        int multiplyResult = 1;
        for (int number : integerList) {
            multiplyResult = multiplication.multiply(number,multiplyResult);
        }
        System.out.println(multiplyResult);
    }
}

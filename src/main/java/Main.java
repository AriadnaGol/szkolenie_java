import cyber.trainees.homework.homework01.Homework01Service;
import cyber.trainees.homework.homework02.*;

public class Main {
    public static void main(String[] args) {
        //Homework01Service homework01Service = new Homework01Service();
        //homework01Service.printCalculations();

        Calculator calculator = new Calculator(new Addition(), new Subtraction(), new Multiplication(), new Division());
        calculator.printCalculations();
    }
}


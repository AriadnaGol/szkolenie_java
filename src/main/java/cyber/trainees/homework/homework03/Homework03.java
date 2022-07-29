package cyber.trainees.homework.homework03;

import java.util.Scanner;

public class Homework03 {

    //ZADANIE 1
    public int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        return scanner.nextInt();
    }

    //ZADANIE 2
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        return scanner.next();
    }

    //ZADANIE 3
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    //ZADANIE 4
    public boolean isMultipleOf3And5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    //ZADANIE 5
    public double raiseToPowerOf3(double number) {
        return Math.pow(number, 3);
    }

    //ZADANIE 6
    public double getSqrtOfNumber(double number) {
        return Math.sqrt(number);
    }
}

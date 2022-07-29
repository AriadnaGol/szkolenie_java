import cyber.trainees.homework.homework03.Homework03;
import cyber.trainees.wyjasnienia.Basics;
import cyber.trainees.wyjasnienia.BasicsInteger;

public class Main {
    public static void main(String[] args) {
        Homework03 homework03 = new Homework03();

        //ZADANIE 1
        var age = homework03.getAge();
        System.out.println("Twoj wiek to jest: " + age);

        //ZADANIE 2
        var name = homework03.getName();
        System.out.println("Twoje imie to jest: " + name);

        //ZADANIE 3
        System.out.println("Czy liczba 9 jest parzysta? " + homework03.isEven(9));
        System.out.println("Czy liczba 6 jest parzysta? " + homework03.isEven(6));

        //ZADANIE 4
        System.out.println("Czy liczba 30 jest podzielna przez 3 i przez 5? " + homework03.isMultipleOf3And5(30));
        System.out.println("Czy liczba 17 jest podzielna przez 3 i przez 5? " + homework03.isMultipleOf3And5(17));

        //ZADANIE 5
        System.out.println("Liczba 9 podniesiona do potegi 3 to jest: " + homework03.raiseToPowerOf3(9));

        //ZADANIE 6
        System.out.println("Pierwiastek kwadratowy z 16 to jest: " + homework03.getSqrtOfNumber(16.0));
    }
}




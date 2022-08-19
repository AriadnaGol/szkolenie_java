import cyber.trainees.homework.homework01.Homework01Service;
import cyber.trainees.homework.homework02.*;
import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.Vehicle;
import cyber.trainees.inheritance.VehicleModel;
import cyber.trainees.wyjasnienia.*;
import cyber.trainees.wyjasnienia.Zwierzeta.Kot;
import cyber.trainees.wyjasnienia.bankomat.BankomatService;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, ParseException {
        //Petle petle = new Petle();
//
        //var numbers = new ArrayList<BigDecimal>();
        //numbers.add(new BigDecimal(9));
        //numbers.add(new BigDecimal(3));
        //numbers.add(new BigDecimal(5));
        //petle.displayAllElements(numbers);

        //InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
        //boolean wynik = instrukcjeWarunkowe.isEqualTo10(3);
        //System.out.println(wynik);

        //instrukcjeWarunkowe.wyswietlSwitch(20);

        //Choinka choinka = new Choinka();
        //System.out.println("wpisz wysokosc choinki");
        //Scanner scanner = new Scanner(System.in);
        //int wysokoscChoinki = scanner.nextInt();
        //choinka.narysujChoinke(wysokoscChoinki);

        //Wyjatki wyjatki = new Wyjatki();
        //wyjatki.uruchom();
        //wyjatki.obliczPierwiastek();

        //Obiekty obiekty = new Obiekty();
        //obiekty.zadanie3();
        //obiekty.zadanie4();
        //obiekty.uruchom();
        //obiekty.zadanie5();

        BankomatService service = new BankomatService();
        //service.uruchom();
        service.uruchom2();
    }
}



package cyber.trainees.wyjasnienia;

import cyber.trainees.wyjasnienia.wyjatek.MojPierwszyException;
import cyber.trainees.wyjasnienia.wyjatek.SwojNowyException;
import cyber.trainees.wyjasnienia.wyjatek.UncheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {

    private void dzielenieLiczb() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        Integer a = scanner.nextInt();
        System.out.println("Podaj drugs liczbe");
        Integer b = scanner.nextInt();

        int wynikZDzielenia = a / b;
        System.out.println("wynik z dzielenia liczb: " + wynikZDzielenia);
        throw new IOException("test");

    }
    public void uruchom() throws IOException {
        //dzielenieLiczb2();
        //wyswietlPierwiastek();
        //try {
        //    getStringLength(null);
        //} catch (NullPointerException exception) {
        //    System.out.println("masz null");
        //}
        //pobierzInformacjeZPliku();
        try {
            wykonajDzielenie(2,8);
        } catch (SwojNowyException e) {
            throw new RuntimeException(e);
        }

        try {
            wykonajDzielenie2(2,8);
        } catch (UncheckedException e) {
            throw new RuntimeException(e);
        }
    }

    private void dzielenieLiczb2() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        Integer a = scanner.nextInt();
        System.out.println("Podaj drugs liczbe");
        Integer b = scanner.nextInt();

            try {
                int wynikZDzielenia = a / b;
                System.out.println("wynik z dzielenia liczb: " + wynikZDzielenia);
            } catch (ArithmeticException exception) {
                System.out.println("blad - niedozwolone dzielenie przez 0, podziel przez inna liczbe np.1");
                dzielenieLiczb2();
            }
    }
    private void wyswietlPierwiastek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        Integer c = scanner.nextInt();
        Double wynik = Math.sqrt(c);

        System.out.println("pierwiastek z liczby: " + Math.sqrt(wynik));

        //try {
        //} catch ( )
    }
    public void obliczPierwiastek() throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbe:");
        Integer liczba = null;
        try {
            liczba = scan.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("zostala podana inna wartosc niz liczba");
            liczba = 0;
        }
        if(liczba < 0) {
            throw new IllegalAccessException("zostala podana liczba ujemna");
        }
        System.out.println("pierwiastek liczby " + liczba + " to: " + Math.sqrt(liczba));
    }
private Integer getStringLength(String text) {
        return text.length();
}
private void pobierzInformacjeZPliku() {
    Scanner scan = null;
    try {
        scan = new Scanner(
                new File("src/java/resources/test.txt")
        );
    } catch (FileNotFoundException e) {
        throw new MojPierwszyException(e.getMessage());
    }
    System.out.println(scan.nextLine());
}

public void wykonajDzielenie (Integer b, Integer c) throws SwojNowyException {

    try {
        Integer a = b/c;
        System.out.println("wynik z dzielenia " + a);
    } catch (Exception exception) {
        throw new SwojNowyException();
    }
}
    public void wykonajDzielenie2 (Integer b, Integer c) throws UncheckedException {

       try {
           Integer a = b/c;
           System.out.println("wynik z dzielenia " + a);
       } catch (Exception exception) {
           throw new UncheckedException();
       }
    }
}

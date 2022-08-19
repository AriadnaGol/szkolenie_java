package cyber.trainees.wyjasnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BankomatService {
    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat();

    private boolean menu(final Integer pozycja) {
        switch (pozycja) {
            case 1:
                System.out.println("wplacam gotowke");
                System.out.println("Prosze podac kwote wplaty:");
                int kwota = scanUser.nextInt();
                sprawdzWprowadzoneKwoty(kwota);
                bankomat.wplacGotowke(kwota);
                System.out.println("Dziekujemy za wplate " + kwota);
                break;
            case 2:
                System.out.println("wyplacam gotowke");
                System.out.println("Prosze podac kwote do wyplaty:");
                int kwotaWyplaty = scanUser.nextInt();
                sprawdzWprowadzoneKwoty(kwotaWyplaty);
                bankomat.sprawdzWyplate(kwotaWyplaty);
                bankomat.wyplacGoltowke(kwotaWyplaty);
                System.out.println("wyplacono " +kwotaWyplaty);
                break;
            case 3:
                System.out.println("stan konta bankomatu");
                System.out.println("Bankomat posiada: " + bankomat.getSaldo());
                break;
        }
        return pozycja != 5;
        }

        private void sprawdzWprowadzoneKwoty(final Integer kwota) {
            List<Integer> nominaly = List.of(10, 20, 50, 100, 200, 500);

            if(!nominaly.contains(kwota)) {
               throw new BusinessException("wprowadz poprawny nominal: akceptowalne nominaly to: " + nominaly);
            }
        }


    public void uruchom() {
        boolean czyMaKontynuowac = false;

        do {
            System.out.println("wybierz dostepna opcje: ");
            System.out.println("1. wplac gotowke");
            System.out.println("2. wyplac  gotowke");
            System.out.println("3. sprawdz stan konta");
            System.out.println("4. sprawdz stan konta karty");
            System.out.println("5. przerwij operacje");

            Integer userInfo = 4;

            try {
                userInfo = scanUser.nextInt();
                czyMaKontynuowac = menu(userInfo);
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu.");
            }
        } while (czyMaKontynuowac);
    }
    public void uruchom2() {


        List<Karta> karty = List.of(
                new Karta(1, 1234, 517),
                new Karta(2,1234,1712)
        );
        boolean czyMaKontynuowac = false;

        System.out.println("wloz karte do bankomatu");
        int nrKarty = scanUser.nextInt();
        Karta card;

        try {
            card = karty.stream().filter(x -> x.getNrKarty() == nrKarty).findFirst().get();
        } catch (NoSuchElementException exception) {
            throw new KartaException("Nie rozpoznano karty");
        }

        System.out.println("prosze podac nr pin:");
        int pinKarty = scanUser.nextInt();
        boolean isCorrectPin = card.getPinKarty() == pinKarty;

        if (!isCorrectPin) {
            throw new KartaException("Pin do karty jest niezgodny");
        }

        do {
            System.out.println("wybierz dostepna opcje: ");
            System.out.println("1. wplac gotowke");
            System.out.println("2. wyplac  gotowke");
            System.out.println("3. sprawdz stan konta");
            System.out.println("4. sprawdz stan konta karty");
            System.out.println("0. przerwij operacje");

            Integer userInfo = 0;

            try {
                userInfo = scanUser.nextInt();
                czyMaKontynuowac = menu2(userInfo, card);
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu.");
            }
        } while (czyMaKontynuowac);
    }
    private boolean menu2(final Integer pozycja, Karta karta) {
        switch (pozycja) {
            case 1:
                System.out.println("wplacam gotowke");
                System.out.println("Prosze podac kwote wplaty:");
                int kwota = scanUser.nextInt();
                sprawdzWprowadzoneKwoty(kwota);
                bankomat.wplacGotowke(kwota);
                karta.wplacGotowke(kwota);
                System.out.println("Dziekujemy za wplate na karte" + kwota);
                break;
            case 2:
                System.out.println("wyplacam gotowke");
                System.out.println("Prosze podac kwote do wyplaty:");
                int kwotaWyplaty = scanUser.nextInt();
                sprawdzWprowadzoneKwoty(kwotaWyplaty);
                bankomat.sprawdzWyplate(kwotaWyplaty);
                karta.sprawdzSaldoKarty(kwotaWyplaty);
                karta.wyplacGotowke(kwotaWyplaty);
                bankomat.wyplacGoltowke(kwotaWyplaty);
                System.out.println("wyplacono " +kwotaWyplaty);
                break;
            case 3:
                System.out.println("stan konta bankomatu");
                System.out.println("Bankomat posiada: " + bankomat.getSaldo());
                break;
            case 4:
                System.out.println("stan konta karty: " + karta.getSaldoKarty());
        }
        return pozycja != 0;
    }

}


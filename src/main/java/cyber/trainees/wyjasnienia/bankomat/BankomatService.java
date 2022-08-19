package cyber.trainees.wyjasnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
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
}

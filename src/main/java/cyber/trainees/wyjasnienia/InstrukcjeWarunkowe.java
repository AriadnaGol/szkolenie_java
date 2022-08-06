package cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {
    public boolean isEqualTo10(int number) {
        if (number == 10) {
            System.out.println("wynik jest równy 10");
            return true;
        }
        return false;
    }

    //zad 2 switch

    public void wyswietlSwitch (Integer jakiDzienTygodnia) {
        switch (jakiDzienTygodnia) {
            case 1: {
                System.out.println("to");
                System.out.println("jest");
                System.out.println("Poniedzialek");
            }
            break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("nieprawidlowy dzien tygodnia");
        }
    }
}

/*


// tu silnia




 */
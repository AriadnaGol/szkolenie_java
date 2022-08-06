package cyber.trainees.wyjasnienia;

public class Choinka {
    public void narysujChoinke(int wysokoscChoinki) {
        int liczbaSpacjiPrzed = wysokoscChoinki - 1;
        int liczbaGwiazdek = 1;
        for (int i = 0; i < wysokoscChoinki; i++) {
            for (int j = 0; j < liczbaSpacjiPrzed; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < liczbaGwiazdek; k++) {
                System.out.print("*");
            }
            liczbaSpacjiPrzed -= 1;
            liczbaGwiazdek += 2;
            System.out.println();
        }
    }
}

//private void choinkaRozbudowana(Integer wysokoscChoinki) {
//    Integer iloscGwiazdekWPodstawie = wysokoscChoinki + 2;
//    for (int szerokosc = 1; szerokosc = wysokoscChoinki - 1; szerokosc--) {
//        for () {
//*

//    }
//}
//    //zadanie 1
//
//    public void tylkoPodzielnePrzez5() {
//
//        Integer sumaLiczb = 0;
//        Integer iloscLiczb = 0;
//
//        for (int i = 1; i <= 100; i++) {
//        if (i % 5 == 0) {
//       //     System.out.println("Podzielne przez 5: " + i);
//            System.out.println(i);
//
//            iloscLiczb = sumaLiczb + 1;
//            iloscLiczb += 1;
//        }
//            System.out.println("Suma Liczb: " + sumaLiczb);
//            System.out.println("Ilosc znalezionych Liczb: " + iloscLiczb);
//    }
//    }
//
package cyber.trainees.wyjasnienia;

public class Basics {

    public String tekst;
    public void wyswietlTekst1(String tekst) {
        System.out.println("Wyswietl tekst:" + tekst);

        //public String tekst2 = " ";
        //public Basics(final String tekst) {
        //this.tekst2 = tekst;
         //}
    }
    public void wyswietlTekst2(String tekst, String tekst2,String tekst3) {
        System.out.println(tekst3 + tekst2 +tekst);
    }
    public Basics() {
    }
    public void wyswietlTekst3() {
        System.out.println(tekst);
    }

    public Basics(String tekst) {
        this.tekst = tekst;
    }

    public void wyswietekst(Integer liczba) {
        System.out.println(liczba);
    }
}

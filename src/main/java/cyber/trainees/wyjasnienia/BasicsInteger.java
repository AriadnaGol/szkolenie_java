package cyber.trainees.wyjasnienia;

public class BasicsInteger {
    public void wyswietlLiczbe(Integer liczbaDoWyswietlenia) {
        System.out.println(liczbaDoWyswietlenia);
    }
    public void wyswietlParamerty(String tekstDoWyswietlenia, Integer liczbaDoWyswietlenia, Integer liczba2DoWyswietlenia) {
       int a = liczbaDoWyswietlenia + liczba2DoWyswietlenia;
        System.out.println(tekstDoWyswietlenia + " " + a);
    }
    public Integer dodajIntegery(Integer a, Integer b){
        return a + b;
    }
}

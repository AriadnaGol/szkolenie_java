package cyber.trainees.wyjasnienia.Zwierzeta;

        import java.time.LocalDate;

public class Papuga extends Zwierze {
    private final String imie;
    private final LocalDate dataUrodzenia;
    private final Double waga;
    private final String imieOpiekuna;

    public Papuga(String imie, LocalDate dataUrodzenia, Double waga, String imieOpiekuna, Double wzrost, Boolean czyMaSiersc) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }
    public Papuga(String imie, LocalDate dataUrodzenia, Double waga, String imieOpiekuna) {
        super(23, false);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String przedstawSie() {
        return "jestem Papuga. Moje imie: " + this.imie
                + " Moja waga: " + this.waga
                + " Moja data urodzenia: " + this.dataUrodzenia
                + " Moj opiekun to: " + this.imieOpiekuna
                + " moj wzrost: " + getWzrost()
                + " czy mam siersc? " + getCzyMaSiersc();
    }

    @Override
    public void dajGlos() {
        System.out.println("uuuu!!");
    }
}


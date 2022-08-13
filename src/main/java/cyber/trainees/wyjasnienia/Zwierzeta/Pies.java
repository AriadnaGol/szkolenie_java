package cyber.trainees.wyjasnienia.Zwierzeta;

import java.time.LocalDate;

public class Pies extends Zwierze {
    private final String imie;
    private final LocalDate dataUrodzenia;
    private final Double waga;
    private final String imieOpiekuna;

    public Pies(String imie, LocalDate dataUrodzenia, Double waga, String imieOpiekuna, Double wzrost, Boolean czyMaSiersc) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    @Override
    public void dajGlos() {
        System.out.println("Hau hau!!");
    }
}


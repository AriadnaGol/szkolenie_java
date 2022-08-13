package cyber.trainees.wyjasnienia.Zwierzeta;

public class Zwierze {
    private final Double wzrost;
    private final Boolean czyMaSiersc;

    public Zwierze (double wzrost, Boolean czyMaSiersc) {
        this.wzrost = wzrost;
        this.czyMaSiersc = czyMaSiersc;
    }

    public Double getWzrost() {
        return wzrost;
    }

    public Boolean getCzyMaSiersc() {
        return czyMaSiersc;
    }
}

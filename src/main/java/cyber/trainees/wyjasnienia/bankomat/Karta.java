package cyber.trainees.wyjasnienia.bankomat;

public class Karta {
    private final Integer nrKarty;
    private final Integer pinKarty;
    private Integer saldoKarty;

    public Karta(Integer nrKarty, Integer pinKarty, Integer saldoKarty) {
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldoKarty =saldoKarty;
    }

    public Integer getNrKarty() {
        return nrKarty;
    }

    public Integer getPinKarty() {
        return pinKarty;
    }
    public Integer getSaldoKarty() {
        return saldoKarty;
    }
    public void wplacGotowke (Integer kwota) {
        saldoKarty += kwota;
    }
    public void wyplacGotowke (Integer kwota) {
        saldoKarty -= kwota;
    }
    public void sprawdzSaldoKarty (Integer kwota) {
        if(saldoKarty < kwota) {
            throw new StanKontaBankomatuException("Niewystarczajaca ilosc srodkow na karcie");
        }
    }
}

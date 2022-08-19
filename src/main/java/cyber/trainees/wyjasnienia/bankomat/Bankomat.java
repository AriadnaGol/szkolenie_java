package cyber.trainees.wyjasnienia.bankomat;

public class Bankomat {
    private Integer saldo;

    public Integer getSaldo() {
        return saldo;
    }

    public Bankomat(Integer saldo) {
        this.saldo = saldo;
    }

    public Bankomat() {
        this.saldo = 10000;
    }

    public void wplacGotowke(Integer kwota) {
        this.saldo += kwota;
    }
    public  void sprawdzWyplate(final Integer kwota) {
        if (this.saldo < kwota) {
            throw new StanKontaBankomatuException("niewystarczajac ilosc gotowki w bankomacie");
        }
    }

    public  void wyplacGoltowke(Integer kwota) {
        this.saldo -= kwota;
    }
 }

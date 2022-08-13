package cyber.trainees.wyjasnienia;

import cyber.trainees.wyjasnienia.Zwierzeta.Kot;

import java.time.LocalDate;

public class Obiekty {

    public void uruchom() {
        Kot kot = new Kot("Kiara ", LocalDate.of(2022,4,18),1.9, "Wiki");
        //kot.przedstawSie();
        System.out.println(kot.przedstawSie());
    }

}

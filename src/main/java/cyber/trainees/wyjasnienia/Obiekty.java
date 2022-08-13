package cyber.trainees.wyjasnienia;

import cyber.trainees.wyjasnienia.Zwierzeta.Kot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obiekty {

    public void uruchom() {
        List<Kot> koty = new ArrayList<>();

        Kot kot1 = new Kot("Kiara ", LocalDate.of(2022,4,18),1.9, "Wiki");
        koty.add(kot1);

        Kot kot2 = new Kot("Kalhula ", LocalDate.of(2021,4,30),3.9, "Wiki");
        koty.add(kot2);

        Kot kot3 = new Kot("Kociuna ", LocalDate.of(2022,4,18),1.9, "Wiki", 40.0, true);
        koty.add(kot3);

        for (Kot kot: koty) {
            System.out.println(kot.przedstawSie());
        }
    }
}

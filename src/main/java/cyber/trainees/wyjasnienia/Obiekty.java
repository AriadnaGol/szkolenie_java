package cyber.trainees.wyjasnienia;

import cyber.trainees.wyjasnienia.Zwierzeta.Kot;
import cyber.trainees.wyjasnienia.Zwierzeta.Papuga;
import cyber.trainees.wyjasnienia.Zwierzeta.Pies;
import cyber.trainees.wyjasnienia.Zwierzeta.Zwierze;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obiekty {

    public void zadanie3() {
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

    public void zadanie4() {
        List<Zwierze> zwierzaki = new ArrayList<>();
        zwierzaki.add(new Kot("Kiara ", LocalDate.of(2022,4,18),1.9, "Wiki"));
        zwierzaki.add(new Kot("Kalhula ", LocalDate.of(2021,4,30),3.9, "Wiki"));
        zwierzaki.add(new Kot("Kociuna ", LocalDate.of(2022,4,18),1.9, "Wiki", 40.0, true));
        zwierzaki.add(new Pies("Azor ", LocalDate.of(2022,4,18),1.9, "Wiki", 40.0, true));

        for (Zwierze zwierze: zwierzaki) {
            if (zwierze instanceof Kot) {
                System.out.println(((Kot) zwierze).przedstawSie());
                zwierze.dajGlos();
            } else if (zwierze instanceof Pies) {
                System.out.println(((Pies) zwierze).przedstawSie());
                zwierze.dajGlos();
            }
        }
    }

    public void zadanie5() throws FileNotFoundException, ParseException {
        File file = new File("src/main/resources/zwierzeta.txt");
        Scanner scanner = new Scanner(file);
        List<Zwierze> zwierzeta = new ArrayList<>();
        DateConverter dateConverter = new DateConverter();

        while (scanner.hasNext()) {
            var zwierzeLine = scanner.nextLine();
            var zwierzeProperties = zwierzeLine.split(", ");
            if (zwierzeProperties[0].equals("PIES")) {
                zwierzeta.add(new Pies(
                        zwierzeProperties[1],
                        dateConverter.parseStringToDate(zwierzeProperties[2]),
                        Double.parseDouble(zwierzeProperties[3]),
                        zwierzeProperties[4],
                        Double.parseDouble(zwierzeProperties[5]),
                        Boolean.parseBoolean(zwierzeProperties[6])
                ));
            } else if (zwierzeProperties[0].equals("KOT")) {
                zwierzeta.add(new Kot(
                        zwierzeProperties[1],
                        dateConverter.parseStringToDate(zwierzeProperties[2]),
                        Double.parseDouble(zwierzeProperties[3]),
                        zwierzeProperties[4],
                        Double.parseDouble(zwierzeProperties[5]),
                        Boolean.parseBoolean(zwierzeProperties[6])
                ));
            } else if (zwierzeProperties[0].equals("PAPUGA")) {
                zwierzeta.add(new Papuga(
                        zwierzeProperties[1],
                        dateConverter.parseStringToDate(zwierzeProperties[2]),
                        Double.parseDouble(zwierzeProperties[3]),
                        zwierzeProperties[4],
                        Double.parseDouble(zwierzeProperties[5]),
                        Boolean.parseBoolean(zwierzeProperties[6])
                ));
            }

            for (Zwierze zwierze : zwierzeta) {
                if (zwierze instanceof Kot) {
                    System.out.println(((Kot) zwierze).przedstawSie());
                    zwierze.dajGlos();
                } else if (zwierze instanceof Pies) {
                    System.out.println(((Pies) zwierze).przedstawSie());
                    zwierze.dajGlos();
                }
            }
        }
    }

    public void uruchom() {
        DateConverter dateConverter = new DateConverter();
        try {
            dateConverter.parseStringToDate("2022/02/5");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

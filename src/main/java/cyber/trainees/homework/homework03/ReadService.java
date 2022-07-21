package cyber.trainees.homework.homework03;

import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.VehicleModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class ReadService {
    private Scanner systemScanner;

    public ReadService(Scanner scanner) {
        this.systemScanner = scanner;
    }

    //ZADANIE 3
    public void getCarsFromSingleFile() throws FileNotFoundException {
        Scanner fileScanner = new Scanner (new File("src/main/resources/samochody/wszystkieSamochody.txt"));
        for (int i = 1; i <= 3; i ++) {
            String fileContent = fileScanner.nextLine();
            String[] carFields = fileContent.split(", ");

            VehicleModel car = new VehicleModel(
                    carFields[0],
                    carFields[1],
                    carFields[2],
                    carFields[3],
                    Integer.valueOf(carFields[4]),
                    Double.valueOf(carFields[5]),
                    Color.valueOf(carFields[6])
            );

            System.out.println("Pojazd nr " + i + ": "  + car);
        }
    }

    //ZADANIE 2
    public void getCarsFromFiles() throws FileNotFoundException {
        int totalMileage = 0;
        double[] availableEngineCapacities = new double[3];
        for (int i = 1; i <= 3; i ++) {
            Scanner fileScanner = new Scanner (new File("src/main/resources/samochody/samochod" + i + ".txt"));
            String fileContent = fileScanner.nextLine();

            String[] carFields = fileContent.split(", ");

            VehicleModel car = new VehicleModel(
                    carFields[0],
                    carFields[1],
                    carFields[2],
                    carFields[3],
                    Integer.valueOf(carFields[4]),
                    Double.valueOf(carFields[5]),
                    Color.valueOf(carFields[6])
            );

            totalMileage = totalMileage + car.getMileage();
            availableEngineCapacities[i-1] = car.getEngineCapacity();

            System.out.println("Pojazd nr " + i + ": "  + car);
        }

        System.out.println("Laczna ilosc przejechanych kilometrow przez samochody: " + totalMileage);
        System.out.println("Dostepne pojemosci silnikow samochodow: " +
                availableEngineCapacities[0] + ", " +
                availableEngineCapacities[1] + ", " +
                availableEngineCapacities[2]
        );
    }

    //ZADANIE 1
    public void getInputsFromUser() {
        handleIntNumbers();
        handleDecimalNumbers();
    }

    private void handleIntNumbers() {
        int resultOfAddition = 0;
        int multiplicationResult = 1;
        int[] intNumbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Write number:");
            intNumbers[i] = systemScanner.nextInt();
            resultOfAddition = resultOfAddition + intNumbers[i];
            multiplicationResult = multiplicationResult * intNumbers[i];
        }

        System.out.println("Dodawanie liczb [" +
                intNumbers[0] + ", " +
                intNumbers[1] + ", " +
                intNumbers[2] + ", " +
                intNumbers[3] + ", " +
                intNumbers[4] + "]: " + resultOfAddition
        );

        System.out.println("Mnozenie przez 10 liczb: ");
        System.out.println(intNumbers[0] + "*10: " + (intNumbers[0] * 10));
        System.out.println(intNumbers[1] + "*10: " + (intNumbers[1] * 10));
        System.out.println(intNumbers[2] + "*10: " + (intNumbers[2] * 10));
        System.out.println(intNumbers[3] + "*10: " + (intNumbers[3] * 10));
        System.out.println(intNumbers[4] + "*10: " + (intNumbers[4] * 10));

        System.out.println("Dzielenie przez 2 liczb: ");
        System.out.println(intNumbers[0] + "/2: " + (intNumbers[0] /2));
        System.out.println(intNumbers[1] + "/2: " + (intNumbers[1] /2));
        System.out.println(intNumbers[2] + "/2: " + (intNumbers[2] /2));
        System.out.println(intNumbers[3] + "/2: " + (intNumbers[3] /2));
        System.out.println(intNumbers[4] + "/2: " + (intNumbers[4] /2));
    }

    private void handleDecimalNumbers() {
        BigDecimal resultOfAddition = BigDecimal.valueOf(0);
        BigDecimal multiplicationResult = BigDecimal.valueOf(1);
        BigDecimal[] bigDecimalNumbers = new BigDecimal[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Write number:");
            bigDecimalNumbers[i] = systemScanner.nextBigDecimal();
            resultOfAddition = resultOfAddition.add(bigDecimalNumbers[i]);
            multiplicationResult = multiplicationResult.multiply(bigDecimalNumbers[i]);
        }

        System.out.println("Dodawanie liczb [" +
                bigDecimalNumbers[0] + ", " +
                bigDecimalNumbers[1] + ", " +
                bigDecimalNumbers[2] + ", " +
                bigDecimalNumbers[3] + ", " +
                bigDecimalNumbers[4] + "]: " + resultOfAddition
        );

        System.out.println("Mnozenie przez 10 liczb: ");
        System.out.println(bigDecimalNumbers[0] + "*10: " + (bigDecimalNumbers[0].multiply(BigDecimal.valueOf(10))));
        System.out.println(bigDecimalNumbers[1] + "*10: " + (bigDecimalNumbers[1].multiply(BigDecimal.valueOf(10))));
        System.out.println(bigDecimalNumbers[2] + "*10: " + (bigDecimalNumbers[2].multiply(BigDecimal.valueOf(10))));
        System.out.println(bigDecimalNumbers[3] + "*10: " + (bigDecimalNumbers[3].multiply(BigDecimal.valueOf(10))));
        System.out.println(bigDecimalNumbers[4] + "*10: " + (bigDecimalNumbers[4].multiply(BigDecimal.valueOf(10))));

        System.out.println("Dzielenie przez 2 liczb: ");
        System.out.println(bigDecimalNumbers[0] + "/2: " + (bigDecimalNumbers[0].divide(BigDecimal.valueOf(2))));
        System.out.println(bigDecimalNumbers[1] + "/2: " + (bigDecimalNumbers[1].divide(BigDecimal.valueOf(2))));
        System.out.println(bigDecimalNumbers[2] + "/2: " + (bigDecimalNumbers[2].divide(BigDecimal.valueOf(2))));
        System.out.println(bigDecimalNumbers[3] + "/2: " + (bigDecimalNumbers[3].divide(BigDecimal.valueOf(2))));
        System.out.println(bigDecimalNumbers[4] + "/2: " + (bigDecimalNumbers[4].divide(BigDecimal.valueOf(2))));
    }
}

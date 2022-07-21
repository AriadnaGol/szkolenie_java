import cyber.trainees.collections.CollectionsService;
import cyber.trainees.homework.homework01.Homework01Service;
import cyber.trainees.homework.homework02.*;
import cyber.trainees.homework.homework03.ReadService;
import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.Vehicle;
import cyber.trainees.inheritance.VehicleModel;
import cyber.trainees.service.ReadData;
import cyber.trainees.spotkania.Loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Homework01Service homework01Service = new Homework01Service();
        //homework01Service.printCalculations();

        //Calculator calculator = new Calculator(new Addition(), new Subtraction(), new Multiplication(), new Division());
        //calculator.printCalculations();

        //Vehicle vehicle = new Vehicle("Volvo", "2022", "all wheels drive");
        //System.out.println(vehicle.toString());

        VehicleModel modelVehicle = new VehicleModel(
                "Volvo",
                "2022",
                "all wheels drive",
                "XC60",
                1000,
                2000.0,
                Color.WHITE);

        modelVehicle.setBrand("Lexus");
        modelVehicle.setName("RX 540");
       // System.out.println(modelVehicle);

        // CollectionsService service = new CollectionsService();
        // service.printCollections();
        Loops loops = new Loops();
        //loops.printNumbers();

        //loops.printLetters();

        Calculator calculator = new Calculator(new Addition(), new Subtraction(), new Multiplication(), new Division());
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(1.2);
        numbers.add(1.3);
        numbers.add(1.4);
        numbers.add(2.4);
        //calculator.printDoubleResult(numbers);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        ));

        //calculator.printIntsResult(numbers2);

        Set<Integer> number3 = new HashSet<>(Set.of(1,2,3,18));
        //calculator.printISet(number3);

        //System.out.println("Jak masz na imie?");
        //ReadData readData = new ReadData();
        //String firstName = readData.getDataReadFromKeyboard();
        //System.out.println("Witaj " + firstName);

        ReadData readData = new ReadData();
        VehicleModel vehicleModelFromFile;
       try {
          vehicleModelFromFile = readData.getVehicleModel(new File("src/main/resources/vehicleModel.txt"));
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
//
        //System.out.println(vehicleModelFromFile);

       ReadService readService = new ReadService(new Scanner(System.in));
       //readService.getInputsFromUser();
        //try {
        //    readService.getCarsFromFiles();
        //} catch (FileNotFoundException e) {
        //    throw new RuntimeException(e);
        //}

        try {
            readService.getCarsFromSingleFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

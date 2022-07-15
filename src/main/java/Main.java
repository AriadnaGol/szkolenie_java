import cyber.trainees.homework.homework01.Homework01Service;
import cyber.trainees.homework.homework02.*;
import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.Vehicle;
import cyber.trainees.inheritance.VehicleModel;

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
        System.out.println(modelVehicle);
    }
}


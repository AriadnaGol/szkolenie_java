package cyber.trainees.service;

import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.VehicleModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public String getDataReadFromKeyboard() {
        Scanner scanner = new Scanner(System.in); //System.in to jest obiekt typu InputStream
        return scanner.nextLine();
    }

    public String getDataFromFile(File externalFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(externalFile);
        return scanner.nextLine();
    }

    public VehicleModel getVehicleModel(File externalFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(externalFile);
        String line = scanner.nextLine();

        String[] fields = line.split(", ");

        VehicleModel vehicleModel = new VehicleModel(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                Integer.valueOf(fields[4]),
                Double.valueOf(fields[5]),
                Color.valueOf(fields[6]));

        return vehicleModel;
    }
}


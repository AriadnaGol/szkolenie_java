package cyber.trainees.inheritance;

public class Vehicle {
    private final String brand;
    private final String productionYear;
    private final String carDrive;

    public Vehicle(String brand, String productionYear, String carDrive) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.carDrive = carDrive;
    }

    public String getCarDrive() {
        return carDrive;
    }

    public String getBrand() {
        return brand;
    }

    public String getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Marka: " + getBrand() + " Rocznik: " + getProductionYear() + " Napęd: " + getCarDrive();
    }
}

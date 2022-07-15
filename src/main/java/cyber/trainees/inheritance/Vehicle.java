package cyber.trainees.inheritance;

public class Vehicle {
    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public void setCarDrive(String carDrive) {
        this.carDrive = carDrive;
    }

    private String brand;
    private String productionYear;
    private String carDrive;

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

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Marka: " + getBrand() + " Rocznik: " + getProductionYear() + " Napęd: " + getCarDrive();
    }
}

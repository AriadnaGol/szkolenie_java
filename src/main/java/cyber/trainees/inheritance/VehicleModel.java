package cyber.trainees.inheritance;

public class VehicleModel extends Vehicle {
    private final String name;
    private final int mileage;
    private final double engineCapacity;
    private final Color color;

    public VehicleModel(String brand, String productionYear, String carDrive, String name, int mileage, double engineCapacity, Color color) {
        super(brand, productionYear, carDrive);
        this.name = name;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Marka: " + getBrand() +
                " Rocznik: " + getProductionYear() +
                " Naped: " + getCarDrive() +
                " Nazwa modelu: " + getName() +
                " Przebieg: " + getMileage() +
                " Pojemnosc silnika: " + getEngineCapacity() +
                " Kolor: " + getColor();
    }
}

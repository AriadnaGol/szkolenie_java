package cyber.trainees.inheritance;

public class VehicleModel extends Vehicle {
    private String name;
    private int mileage;
    private double engineCapacity;
    private Color color;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setColor(Color color) {
        this.color = color;
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


public class Car {
    private int id;
    private String brand;
    private String modelName;
    private double engineCapacity;
    private String fuel;
    private int numberOfSeats;
    private String colour;
    private String year;
    private int kmsDriven;
    private int wheelDrivenCount;
    private String driveSide;

    public Car(int id, String brand, String modelName, double engineCapacity, String fuel, int numberOfSeats, String colour, String year, int kmsDriven, int wheelDrivenCount, String driveSide) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.engineCapacity = engineCapacity;
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.colour = colour;
        this.year = year;
        this.kmsDriven = kmsDriven;
        this.wheelDrivenCount = wheelDrivenCount;
        this.driveSide = driveSide;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuel() {
        return fuel;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColour() {
        return colour;
    }

    public String getYear() {
        return year;
    }

    public int getKmsDriven() {
        return kmsDriven;
    }

    public int getWheelDrivenCount() {
        return wheelDrivenCount;
    }

    public String getDriveSide() {
        return driveSide;
    }
}




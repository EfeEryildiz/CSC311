public class Car extends Vehicle {
    private String brand;
    private String model;
    private int year;
    private int price;
    //I also went ahead and added the model, year and price attributes to the Car class.

    // Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand, String model,  int year, int price) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public String getmodel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method to honk the car horn
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Override displayInfo method to include all attributes to the car
    @Override
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + " liters");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}
public class Main {
    public static void main(String[] args) {
        // Instantiate a Vehicle object
        Vehicle myVehicle = new Vehicle(4, "Davit Grey", 3.6f, "Gasoline");

        // Instantiate a Car object
        Car myCar = new Car(4, "Davit Grey", 3.6f, "Gasoline", "BMW", "M340i X-Drive", 2023, 70000);

        // Display Vehicle information
        myCar.displayInfo(); // Display all the car details
        myCar.honk(); // Make the car honk
    }
}
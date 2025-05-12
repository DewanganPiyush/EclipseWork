import BasicsPractice.Car;

public class Car {
    // Instance variables (attributes)
    String model;
    int year;
    double price;

    // Constructor to initialize instance variables
    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Instance method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: $" + price);
    }

    // Instance method to calculate car depreciation
    public void calculateDepreciation() {
        int age = 2025 - year;  // Assuming the current year is 2025
        double depreciation = price * 0.05 * age;
        double newPrice = price - depreciation;
        System.out.println("Car Depreciation: $" + depreciation);
        System.out.println("Price after Depreciation: $" + newPrice);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create objects (instances) of the Car class
        Car car1 = new Car("Toyota Camry", 2015, 25000);
        Car car2 = new Car("Honda Civic", 2020, 22000);

        // Calling instance methods using objects
        car1.displayDetails();
        car1.calculateDepreciation();

        System.out.println(); // Just a blank line for separation

        car2.displayDetails();
        car2.calculateDepreciation();
    }
}

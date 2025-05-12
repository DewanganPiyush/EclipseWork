package BasicsPractice;

public class Classes {
	
	String model;
    int year;
    double price;

    // Constructor to initialize instance variables
    public Classes(String model, int year, double price) {
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
    @Override
    public String toString() {
    	return "Car Model: " + model + "Car Year: " + year + "Car Price: $" + price;
    }

	public static void main(String[] args) {
		
		// Create objects (instances) of the Car class
        Classes car1 = new Classes("Toyota Camry", 2015, 25000);
        Classes car2 = new Classes("Honda Civic", 2020, 22000);

        // Calling instance methods using objects
        //car1.displayDetails();
        //car1.calculateDepreciation();

        System.out.println(car1.toString()); // Just a blank line for separation

        //car2.displayDetails();
        //car2.calculateDepreciation();
    

	}

}

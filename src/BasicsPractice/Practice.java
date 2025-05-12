package BasicsPractice;

public class Practice {

	public static void main(String[] args) {
		
		//data types
		int age = 25;               
        double price = 19.99;       
        char grade = 'A';
        String str = "Dashboard";
        boolean isStudent = true;   

        
        int sum = age + 5;          
        double discount = price * 0.1; 
        boolean isEligible = age > 18 && isStudent; 

        
        System.out.println("Age after 5 years: " + sum);
        System.out.println("Discount amount: " + discount);
        System.out.println("you can see my " + str);
        System.out.println("Is eligible for student discount: " + isEligible);
        
        
        
     // Integer types
        byte byteValue = 100;          
        short shortValue = 32000;      
        int intValue = 50000;          
        long longValue = 100000L;      

        // Floating-point types
        float floatValue = 10.5f;      
        double doubleValue = 15.99;    

        // Other types
        char characterValue = 'J';     
        boolean booleanValue = true;   

        
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + characterValue);
        System.out.println("Boolean value: " + booleanValue);
    
        
     // Variable declarations and initializations
        int number = 10;              
        String name = "John";         
        double salary = 50000.50;     

        // Variable types can also be declared without initialization
        float temperature;            // Declared but not initialized
        boolean isActive;             // Declared but not initialized

        // Initializing the uninitialized variables
        temperature = 98.6f;          // Now initialized
        isActive = true;              // Now initialized

        
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Temperature: " + temperature);
        System.out.println("Is Active: " + isActive);
      
        
     // Implicit casting: int to double
        int num = 100;
        double num1 = num; // Automatically casted from int to double
        
        System.out.println("Integer value: " + num);  // Output: 100
        System.out.println("Double value: " + num1); // Output: 100.0
        
     // Explicit casting: double to int (can result in data loss)
        double num2 = 9.99;
        int num3 = (int) num2; // Explicitly casted from double to int

        System.out.println("Double value: " + num2); // Output: 9.99
        System.out.println("Integer value: " + num3);   // Output: 9 (data loss occurred)
        
        //char to int
        char charValue = 'A'; // Character 'A' has an ASCII value of 65
        int value = (int) charValue; // Explicitly casting char to int
        
        System.out.println("Char value: " + charValue); // Output: A
        System.out.println("Integer value of char 'A': " + value); // Output: 65

	}

}

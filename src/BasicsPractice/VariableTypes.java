package BasicsPractice;

public class VariableTypes {
	
	// Instance variable
    String instanceVariable = "I am an instance variable";

    // Static variable
    static int staticVariable = 100;


	public static void main(String[] args) {
		
		// Local variable
        int localVariable = 50;

        
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Static Variable: " + staticVariable);

        // Creating an instance to access instance variable
        VariableTypes obj = new VariableTypes();
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // Modifying static variable
        staticVariable = 200;
        System.out.println("Updated Static Variable: " + staticVariable);
		
		

	}

}

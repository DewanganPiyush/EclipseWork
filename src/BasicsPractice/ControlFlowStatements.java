package BasicsPractice;

public class ControlFlowStatements {

	public static void main(String[] args) {
		
		 // 1. if-else and switch statements (conditional)
        int age = 20;
        String day = "Tuesday";

        
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Using switch to print the day of the week
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday.");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "Thursday":
                System.out.println("Today is Thursday.");
                break;
            case "Friday":
                System.out.println("Today is Friday.");
                break;
            default:
                System.out.println("It's a weekend or invalid day.");
        }

        // 2. Loops (for, while, do-while)
        
        // Using a for loop to print numbers 1 to 5
        System.out.println("\nUsing for loop to print numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Using a while loop to print numbers 6 to 10
        System.out.println("\nUsing while loop to print numbers 6 to 10:");
        int j = 6;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

  

        // 3. Jump statements (break and continue)
        
        // break
        System.out.println("\nUsing break statement to stop the loop at 3:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exits the loop when i is 3
            }
            System.out.println(i);
        }

        //continue
        System.out.println("\nUsing continue statement to skip 3:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips the rest of the loop when i is 3
            }
            System.out.println(i);
        }

        // 4. Nested if-else and switch
        System.out.println("\nNested if-else and switch example:");
        int number = 5;
        if (number > 0) {
            System.out.println("The number is positive.");
            switch (number) {
                case 1:
                    System.out.println("It's one.");
                    break;
                case 5:
                    System.out.println("It's five.");
                    break;
                default:
                    System.out.println("It's a positive number but not 1 or 5.");
            }
        } else {
            System.out.println("The number is non-positive.");
        }

	}

}

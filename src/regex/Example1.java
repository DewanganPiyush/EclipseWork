package regex;

import java.util.regex.*;





public class Example1 {

	public static void main(String[] args) {
		
//		String input = "";
//
//        Pattern pattern = Pattern.compile("\\d+"); //  \\d means any digit 0-9 and + means 1 or more
//        Matcher matcher = pattern.matcher(input);
//
//        if (matcher.matches()) {
//            System.out.println("Only digits");
//        } else {
//            System.out.println("Not digits");
//        }
		
		String email = "1213@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email.matches(regex)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
	
		

	}

}

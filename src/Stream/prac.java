package Stream;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
//		System.out.println("simple message");  
//		System.err.println("error message");  
//		
//		String inputFile = "input.txt";
//		String outputFile = "output.txt";
//        
//        // write to file
//        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
//            fos.write("Hello World".getBytes());
//            System.out.println("Data written to file");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Read from file
//        try (FileInputStream fis = new FileInputStream("example.txt")) {
//            int data;
//            while ((data = fis.read()) != -1) {
//                System.out.print((char) data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
		//read data using console class 
		// Get the Console object
//        Scanner scanner = new Scanner(System.in);
//        
//        
//        
//        // Reading text
//        String username = scanner.nextLine();
//        System.out.println("Hello, " + username);
//       
//        // Reading password (input will be hidden)
//        System.out.print("Enter password");
//        String password = scanner.nextLine();
//        System.out.println("Password entered " + password);
//        
//        scanner.close();
		
		try {
			ByteArrayOutputStream bo =  new ByteArrayOutputStream();
			
			String message = "Hello world";
			bo.write(message.getBytes());
			
			byte[] byteArray = bo.toByteArray();
			
			System.out.println("output " + new String(byteArray));
			
			bo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

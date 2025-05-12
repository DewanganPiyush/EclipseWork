package OOPS;

import modifiers.AccessModifier;

//Inheritance 

class Vehicle {
    void startEngine() {
        System.out.println("Starting engine");
    }

    void stopEngine() {
        System.out.println("Stopping engine");
    }
}

class Car extends Vehicle {
    
}

class Bike extends Vehicle {
    
}

public class Main {

	public static void main(String[] args) {
//		
//		Car car = new Car();
//        car.startEngine();
//
//        Bike bike = new Bike();
//        bike.startEngine();
        
//        Abstract CardPayment = new CreditCard();
//        Abstract PayPalPayment = new PayPal();
//
//        
//        CardPayment.processPayment(100.0);
//        CardPayment.printReceipt(100.0);
//
//        PayPalPayment.processPayment(200.0);
//        PayPalPayment.printReceipt(200.0);
		
//		Robot robo = new Robot();
//        robo.start();    
//        robo.operate();  
		
//		Dog myDog = new Dog();
//
//        myDog.eat();    
//        myDog.sleep();  
//        myDog.bark();  
////        
//        myDog.dance();  //super keyword example
		
		
//		Stud s = new Stud("aman"); //this keyword example
//        s.display();
		
		//String common operations
//		String s = "Java Programming";
//		
//		System.out.println(s.length());
//		System.out.println(s.charAt(5));
//		System.out.println(s.substring(5,s.length()));     
//		System.out.println(s.toLowerCase());    
//		System.out.println(s.indexOf("a"));     
//		System.out.println(s.replace("a", "@"));
		
		
		//splitting strings   
//		String fruits = "Apple, Banana, Mango, Orange";
//		String[] arr = fruits.split(", ");
//
//		for (String fruit : arr) {
//		            System.out.println(fruit);
//		}
		
		
		//try catch block
		
//		try  
//        {  
//        int data=50/0; //arithmetic exception    
//        }  
//              
//        catch(ArithmeticException e)  
//        {  
//            System.out.println(e);  
//        }  
//        System.out.println("rest of the code");  
        
        
        //multiple catch block
//        try{    
//            int a[]=new int[5];
//            
//            System.out.println(a[10]); 
//            a[5]=30/0;    
//           }    
//           catch(ArithmeticException e)  
//              {  
//               System.out.println("Arithmetic Exception occurs");  
//              }    
//           catch(ArrayIndexOutOfBoundsException e)  
//              {  
//               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
//              }    
//           catch(Exception e)  
//              {  
//               System.out.println("Parent Exception occurs");  
//              }             
//           System.out.println("rest of the code"); 
           
           
           //finally block
//           try {    
//        	   
//               System.out.println("Inside try block");  
//           
//              int data=25/0;    
//              System.out.println(data);    
//             }   
//         
//             catch(ArithmeticException e){  
//               System.out.println("Exception handled");  
//               System.out.println(e);  
//             }   
//         
//             finally {  
//               System.out.println("finally block is always executed");  
//             }    
//         
//             System.out.println("rest of the code");  
     
		
        //AccessModifier Test
		AccessModifier p = new AccessModifier();
		
		//System.out.println(p.name); 
        //System.out.println(p.city);    
        //System.out.println(p.age);      
        System.out.println(p.country);
		

		
    


	}

}

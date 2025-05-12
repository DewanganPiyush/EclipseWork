package OOPS;

public abstract class Abstract {
	
	
	//abstract method
	public abstract void processPayment(double amount);
	
	//concrete method
	public void printReceipt(double amount) {
        System.out.println("Payment " + amount + " processed");
    }

	

}

//Concrete subclass CreditCard
class CreditCard extends Abstract {
 @Override
 public void processPayment(double amount) {
     System.out.println("Credit Card payment " + amount);
 }
}

//Concrete subclass PayPal
class PayPal extends Abstract {
 @Override
 public void processPayment(double amount) {
     System.out.println("PayPal payment " + amount);
 }
}

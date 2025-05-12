package OOPS;

//Polymerphism

abstract class Payment {
	
	abstract void pay(double amount);
	
		public static void main(String[] args) {
			
			Payment payment = new CreditCardPayment();
	        payment.pay(100.0);

	        payment = new PayPalPayment();
	        payment.pay(50.0);

	        payment = new CashPayment();
	        payment.pay(20.0);

		}
	
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paying " + amount + " by CreditCard");
    }
}

class PayPalPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paying " + amount + " by PayPal");
    }
}

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paying " + amount + " by Cash");
    }
}

	



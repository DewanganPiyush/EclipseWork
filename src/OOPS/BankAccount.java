package OOPS;

//Encapsulation

public class BankAccount {
	
	private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
    	
    	if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal.");
        }
    	
    }
        

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        System.out.println("deposit balance " + account.getBalance());
        
        account.withdraw(200.0);
        System.out.println("withdrawal balance " + account.getBalance());

        //invalid withdrawal
        account.withdraw(2000.0);
	
		
		

	}

}

package OOPS;

//interface method implementation
public class FourWheels implements Fuel {
	
	@Override
    public void calculateEfficiency() {
        System.out.println("Car gives an average of 15 Km per litre");
    }

	public static void main(String[] args) {
		
		Fuel car = new FourWheels();
		car.calculateEfficiency();
		
		
		

	}

}


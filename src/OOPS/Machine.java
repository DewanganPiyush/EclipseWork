package OOPS;

//extends and implements

public class Machine {

	void start() {
        System.out.println("Machine starting");
    }
	
}

//Interface
interface Operable {
 void operate();
}

//subclass
class Robot extends Machine implements Operable {
 public void operate() {
     System.out.println("Robot working");
 }
}
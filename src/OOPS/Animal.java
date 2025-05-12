package OOPS;

//superclass
public class Animal {
	
	void eat() {
        System.out.println("eating food");
    }

    void sleep() {
        System.out.println("sleeping");
    }
    
    void dance() {
    	System.out.println("dancing animal");
    }

}

//subclass
class Dog extends Animal {
 void bark() {
     System.out.println("the dog is barking");
 }
 //examples of super keyword
 @Override
 void dance() {
	 super.dance(); 
 	System.out.println("animal is not dancing");
 }
 
}

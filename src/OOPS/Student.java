package OOPS;

public class Student extends Address {
	
	String name;
    int age;
    int marksMath;
    int marksScience;
    int marksComputer;
    
    public Student(String name, int age, int marksMath, int marksScience, int marksComputer, String city, String state) {
        super(city, state);
    	this.name = name;
        this.age = age;
        this.marksMath = marksMath;
        this.marksScience = marksScience;
        this.marksComputer = marksComputer;
        
        
    }
    
    public Student(String name, int age, String city, String state) {
    	super(city, state);
    	this.name = name;
    	this.age = age;
    }
    
    public void displayDetails() {
        System.out.println("Student Name " + name);
        System.out.println("Age " + age);
        System.out.println("Math Marks " + marksMath);
        System.out.println("Science Marks " + marksScience);
        System.out.println("Computer Marks " + marksComputer);
    }
    
    public double Average() {
        return (marksMath + marksScience + marksComputer) / 3.0;
    }
    
    public String toString() {
    	return "Student Name " + name + " Age " + age + " Math Marks " + marksMath + " Science Marks " + marksScience +  " Computer Marks " + marksComputer;
    }
    
    
    

	public static void main(String[] args) {
		
		Student student1 = new Student("Piyush", 24, 85, 90, 88, "delhi", "delhi"); 
        Student student2 = new Student("Aryan", 24, 92, 95, 89, "bhilai", "CG" ); 
        
        System.out.println(student1.toString());
        
//        student1.displayDetails();
//        student2.displayDetails();
//
//        
//        System.out.println(student1.name + "'s Average Marks: " + student1.Average());
//        System.out.println(student2.name + "'s Average Marks: " + student2.Average());

	}

}

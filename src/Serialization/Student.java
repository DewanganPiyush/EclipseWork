package Serialization;
import java.io.*;

public class Student implements Serializable{
	int id;
	String name;
	transient int age; //not serializing object
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}



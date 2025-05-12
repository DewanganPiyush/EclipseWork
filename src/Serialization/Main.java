package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	public static void main(String[] args) throws Exception {
		
		//Serialize
//        User user = new User("Piyush", 25);
//        FileOutputStream fos = new FileOutputStream("user.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(user);
//        oos.close();
//        fos.close();
//        System.out.println("Object serialized!");
        
        //Deserialize
//        FileInputStream fis = new FileInputStream("user.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        User loadedUser = (User) ois.readObject();
//        ois.close();
//        fis.close();
//        System.out.println("Deserialized User " + loadedUser);
		
		
		  Student s1 = new Student(211,"ravi",22);
		  //serialize
		  //writing object into file    
		  try{FileOutputStream f = new FileOutputStream("f.txt");    
		  ObjectOutputStream out = new ObjectOutputStream(f);    
		  out.writeObject(s1);    
		  out.flush();    
		  out.close();    
		  f.close();    
		  System.out.println("success"); 
		  }
		  catch (IOException e){
			  e.printStackTrace();  
		  }
		  
		  //deserialize
		  try{ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));    
		  Student s=(Student)in.readObject();    
		  System.out.println(s.id+" "+s.name+" "+s.age);    
		  in.close();
		  }
		  catch (IOException | ClassNotFoundException e){
	            e.printStackTrace();
	        }
		    
		    

	}

}

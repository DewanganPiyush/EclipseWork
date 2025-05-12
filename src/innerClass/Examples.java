package innerClass;

//member inner class
//public class Examples {
//	int x = 10;
//	
//	class Inner {
//        void display() {
//            System.out.println("x = " + x);
//        }
//    }
//
//	public static void main(String[] args) {
//		Examples outer = new Examples();
//		Examples.Inner inner = outer.new Inner(); 
//        inner.display(); 
//		
//
//	}
//
//}
//local inner class

//public class Examples {
//	
//	void outerMethod() {
//        int localVar = 5;
//
//        class LocalInner {
//            void show() {
//                System.out.println("localVar = " + localVar);
//            }
//        }
//
//        LocalInner li = new LocalInner();
//        li.show(); 
//    }
//
//	public static void main(String[] args) {
//		new Examples().outerMethod();
//		
//
//	}
//
//}

//Anonymous inner class

//interface Animal {
//    void sound();
//}
//
//
//public class Examples {
//    public static void main(String[] args) {
//    	
//        Animal a = new Animal() { // Anonymous class
//            public void sound() {
//                System.out.println("Roar");
//            }
//        };
//        a.sound(); 
//    }
//}

//static nested class

public class Examples {
	
	static int data = 50;
	
	static class Inner {
        void display() {
            System.out.println("data = " + data);
        }
    }

	public static void main(String[] args) {
		Examples.Inner inner = new Examples.Inner(); //for static inner class we have to create an object of inner class
        inner.display(); 
		

	}

}




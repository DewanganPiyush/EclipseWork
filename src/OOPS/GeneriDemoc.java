package OOPS;

public class GeneriDemoc {
	
	
    static class Box<T> {
        T value;

        void set(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }


	public static void main(String[] args) {
		
		
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("String value: " + stringBox.get());

        
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer value: " + intBox.get());

	}

}

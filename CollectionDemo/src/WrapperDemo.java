
public class WrapperDemo {

	public static void main(String[] args) {
		
		// String to int
    int x = Integer.parseInt("100");
    System.out.println(x + 50);  

    // Boolean parsing
    boolean b = Boolean.parseBoolean("tRuE");
    System.out.println(b);       

    // Character check
    System.out.println(Character.isLetter('4')); 

    // Double compare
    System.out.println(Double.compare(3.5, 4.0)); 

	}

}

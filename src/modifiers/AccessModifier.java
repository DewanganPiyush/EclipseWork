package modifiers;

public class AccessModifier {
	
	private String name = "My name is Piyush";
    String city = "My city is Dalli";
    protected int age = 25;
    public String country = "My country is India";
    
    public static void main(String[] args) {
    	
    	AccessModifier obj = new AccessModifier();
    	System.out.println(obj.name);
    }
    

}

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();

        
        scores.put("Piyush", 90);
        scores.put("Rahul", 75);
        scores.put("Harsh", 85);

        
        System.out.println("Piyush score: " + scores.get("Piyush"));

        //entryset() for iteration
        System.out.println("\nSaare scores:\n");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        
        scores.remove("Harsh");
        System.out.println("\nHarsh removed. Updated map: " + scores);
    

	}

}

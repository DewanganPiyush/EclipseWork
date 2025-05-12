import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.*;

public class HashDemo {

	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("piyush", "mohit", "piyush", "abhinav", "mohit");
		
		Map<String, Integer> hm = new HashMap<>();
		
		for(String s : names) {
			hm.put(s, hm.getOrDefault(s, 0) + 1);
		}
		for(String s: hm.keySet()) {
			int ansCount = hm.get(s);
			System.out.println(s + ":" + ansCount);
		}
	}

}

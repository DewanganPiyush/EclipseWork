import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class UtilityClassDemo {

	public static void main(String[] args) {
		
		// Collections utility
        List<String> list = Arrays.asList("piyush","abhinav","sheetal","piyush");
        System.out.println("Original " + list);
        List<String> copy = new ArrayList<>(list);
        Collections.shuffle(copy);
        System.out.println("Shuffled " + copy);
        
        int freq = Collections.frequency(list, "piyush");
        System.out.println("Frequency of piyush is " + freq);

        // Arrays utility
        int[] a = {3,1,4,2};
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        int idx = Arrays.binarySearch(a, 4);
        System.out.println("Index of 4 is " + idx);

        // Objects utility
        String s1 = null;
        try {
            Objects.requireNonNull(s1, "s1 cannot be null");
        } catch(NullPointerException e) {
            System.out.println("Caught NPE " + e.getMessage());
        }

	}

}

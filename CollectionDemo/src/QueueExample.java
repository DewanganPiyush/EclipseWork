import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();

        //add elements using offer()
        queue.offer("Pehla");
        queue.offer("Dusra");
        queue.offer("Teesra");

        
        System.out.println("Queue ka head: " + queue.peek());

        
        System.out.println("Removed: " + queue.poll());

       
        System.out.println("\nBaaki queue:");
        for (String s : queue) {
            System.out.println(s);
        }

	}

}

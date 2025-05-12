import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
//		HashSet
//		Set<String> set = new HashSet<>();
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Apple");  
//        System.out.println("HashSet: " + set);
//
//	}
//	
	
//	Set ans = new HashSet();
//	ans.add("Hello");
//	ans.add(89);
//	ans.add(false);
//	
//	for(Object types : ans) {
//		System.out.println(types + types.getClass().getTypeName() );
//	}
//
//	
//	}
	
	//Linked HashSet
//	Set<String> linked = new LinkedHashSet<>();
//	linked.add("A");
//	linked.add("C");
//	linked.add("B");
//	System.out.println("LinkedHashSet: " + linked);
//	
//	}
	
//	Set<Integer> tree = new TreeSet<>();
//	tree.add(5);
//	tree.add(1);
//	tree.add(3);
//	System.out.println("TreeSet (sorted): " + tree);
//	
//	}
		//ArrayList
//		List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add(1, "C++");   // insert at index 1
//        for (String lang : list) {
//            System.out.println(lang);
//        }
//    }
	
	//LinkedList
//	List<Integer> ll = new LinkedList<>();
//	ll.add(10);
//	ll.addFirst(5);
//	ll.addLast(20);
//	System.out.println("First: " + ll.getFirst());
//	System.out.println("Last: " + ll.getLast());
//	}
	
	//stack
	Stack<Integer> stack = new Stack<>();
	stack.push(1);
	stack.push(2);
	System.out.println("Top: " + stack.peek());  // 2
	stack.pop();
	System.out.println("After pop: " + stack);
	}

}

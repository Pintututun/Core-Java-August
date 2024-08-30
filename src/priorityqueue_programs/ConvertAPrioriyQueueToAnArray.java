package priorityqueue_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConvertAPrioriyQueueToAnArray {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Black");
	queue.add("Pink");
	queue.add("Green");
	System.out.println("Priority Queue elements:"+queue);
	List<String> list=new ArrayList<String>(queue);
	System.out.println("Array list elements:"+list);
}
}

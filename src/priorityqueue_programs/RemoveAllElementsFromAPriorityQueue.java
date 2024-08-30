package priorityqueue_programs;

import java.util.PriorityQueue;

public class RemoveAllElementsFromAPriorityQueue {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Blue");
	queue.add("Black");
	queue.add("Yellow");
	System.out.println("PriorityQueue elements:"+queue);
	queue.clear();
	System.out.println("PriorityQueue elements:"+queue);
}
}

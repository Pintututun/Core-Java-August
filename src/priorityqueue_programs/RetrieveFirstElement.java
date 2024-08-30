package priorityqueue_programs;

import java.util.PriorityQueue;

public class RetrieveFirstElement {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Green");
	queue.add("Blue");
	System.out.println("Priority Queue elements:"+queue);
	System.out.println("First element of priority queue:"+queue.peek());
}
}

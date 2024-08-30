package priorityqueue_programs;

import java.util.PriorityQueue;

public class RetrieveAndRemoveFirstElement {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Blue");
	queue.add("Green");
	System.out.println("Priority queue elements:"+queue);
	System.out.println("Retrieve and remove the first element:"+queue.poll());
	System.out.println("After removing elements:"+queue);
}
}

package priorityqueue_programs;

import java.util.PriorityQueue;

public class CointNumberOfElements {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Blue");
	queue.add("Pink");
	queue.add("Green");
	System.out.println("PriorityQueue elements:"+queue);
	System.out.println("Number of elements:"+queue.size());
}
}

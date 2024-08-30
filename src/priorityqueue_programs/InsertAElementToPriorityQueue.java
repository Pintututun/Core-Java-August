package priorityqueue_programs;

import java.util.PriorityQueue;

public class InsertAElementToPriorityQueue {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Blue");
	queue.add("Black");
	System.out.println("Before inserting element PriorityQueue elements:"+queue);
	queue.offer("Green");
	System.out.println("After inserting element in PriorityQueue elements:"+queue);
}
}

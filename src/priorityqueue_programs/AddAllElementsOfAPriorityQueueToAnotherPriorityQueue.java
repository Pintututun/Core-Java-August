package priorityqueue_programs;

import java.util.PriorityQueue;

public class AddAllElementsOfAPriorityQueueToAnotherPriorityQueue {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Green");
	queue.add("Blue");
	queue.add("Yellow");
	queue.add("Pink");
	System.out.println(" PriorityQueue elements:"+queue);
	PriorityQueue<String> queue1=new PriorityQueue<>();
	queue1.add("White");
	queue1.add("Black");
	queue1.add("Violet");
	System.out.println("PriorityQueue elements:"+queue1);
	queue.addAll(queue1);
	System.out.println("PriorityQueue elements:"+queue);
	
}
}

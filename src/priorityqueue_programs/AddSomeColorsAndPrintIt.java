package priorityqueue_programs;

import java.util.PriorityQueue;

public class AddSomeColorsAndPrintIt {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<String>();
	queue.add("Red");
	queue.add("Green");
	queue.add("Orange");
	queue.add("White");
	queue.add("Black");
	System.out.println("Elements of Priority Queue:");
	System.out.print(queue);
}
}
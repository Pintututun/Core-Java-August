package priorityqueue_programs;

import java.util.PriorityQueue;

public class ChangePriorityQueueToMaximumPriorityQueue {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Pink");
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Green");
	queue.add("Blue");
	System.out.println("Original Priority queue:"+queue);
	System.out.println("Maximum priority queue:");
	String val="";
	while((val=queue.poll())!=null)
	{
		System.out.print(val+",");
	}
	System.out.println();
}
}

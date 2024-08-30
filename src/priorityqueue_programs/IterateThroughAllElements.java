package priorityqueue_programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IterateThroughAllElements {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Blue");
	queue.add("Green");
	queue.add("White");
	queue.add("Pink");
	Iterator<String> itr=queue.iterator();
	System.out.println("Printing the elements:");
	while(itr.hasNext())
	{
		System.out.print(itr.next()+",");
	}
}
}

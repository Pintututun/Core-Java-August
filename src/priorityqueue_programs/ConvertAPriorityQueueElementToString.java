package priorityqueue_programs;

import java.util.PriorityQueue;

public class ConvertAPriorityQueueElementToString {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Blue");
	queue.add("Black");
	System.out.println("Priority Queue elements:"+queue);
	String rep="";
	rep=queue.toString();
	System.out.println("String representations:"+rep);
}
}

package priorityqueue_programs;

import java.util.PriorityQueue;

public class CompareTwoPriorityQueues {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>();
	queue.add("Orange");
	queue.add("Yellow");
	queue.add("Blue");
	queue.add("Green");
	System.out.println("Priority Queue elements:"+queue);
	PriorityQueue<String> queue1=new PriorityQueue<>();
	queue1.add("White");
	queue1.add("Blue");
	queue1.add("Pink");
	System.out.println("Priority Queue elements:"+queue1);
	PriorityQueue<String> queue2=new PriorityQueue<>();
	for(String ele:queue)
	{
		queue2.add(queue1.contains(ele)?"Yes":"No");
	}
	System.out.println("Compared PriorityQueue:"+queue2);
}
}

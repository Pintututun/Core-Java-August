package linkedlist_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IterateThroughAllElementsStartingAtSpecifiedPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		list.add("Yellow");
		list.add("Orange");
		list.add("Blue");
		list.add("Red");
		list.add("Black");
		list.add("Green");
		System.out.print("Enter the position from where to iterate:");
		int pos = sc.nextInt();
		Iterator<String> itr = list.listIterator(pos - 1);
		System.out.println("Elements starting at specified position:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}

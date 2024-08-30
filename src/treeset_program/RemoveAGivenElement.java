package treeset_program;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveAGivenElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	TreeSet<Integer> ts1 = new TreeSet<>();
	ts1.add(4);
	ts1.add(6);
	ts1.add(10);
	ts1.add(12);
	ts1.add(15);
	ts1.add(2);
	ts1.add(8);
	System.out.println("Treeset elements:" + ts1);
	System.out.print("Enter the element to remove:");
	int ele=Integer.parseInt(sc.nextLine());
    if(ts1.remove(ele))
    {
    	System.out.println("Element is removed");
    }
    else
    {
    	System.out.println("Element is not present");
    }
    System.out.println("TreeSet list after removing:"+ts1);
	

}
}

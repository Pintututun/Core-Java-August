package arrayListProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetrieveAnElementAtSpecifiedIndex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> al=new ArrayList<>();
	while(true)
	{
		System.out.print("Enter element:");
		String ele=sc.nextLine();
		al.add(ele);
		System.out.print("Do you want to continue:Press Yes/No");
		String option=sc.nextLine();
		if(option.startsWith("Y")||option.startsWith("y"))
		{
			System.out.println("Please continue");
		}
		else
		{
			break;
		}
	}
	System.out.println(al);
	System.out.print("Enter the position to retrieve:");
	int pos1=Integer.parseInt(sc.nextLine());
	System.out.print("Enter another position to retrieve:");
	int pos2=Integer.parseInt(sc.nextLine());
	System.out.println("Element at position:"+al.get(pos1-1));
	System.out.println("Element at position:"+al.get(pos2-1));
}
}

package encryptedString;

import java.util.Scanner;

public class ConvertingStringToAnotherCode {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String input=sc.nextLine();
	char []arr=input.toCharArray();
	int []occ=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		int count=1;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j]&&arr[i]!='*')
		{
		    arr[j]='*';
			count++;
		}  
	}
	occ[i]=count;
	}
	StringBuilder str=new StringBuilder();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!='*')
		{
			str.append(arr[i]);
			String t=Integer.toHexString(occ[i]);
			str.append(t);
		}
	}
	str.reverse();
	System.out.println("The String in encrypted format:");
	System.out.println(str);
	
}
}

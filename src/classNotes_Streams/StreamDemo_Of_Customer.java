package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	int id;
	String name;
	float bill;
	public Customer(int id,String name,float bill)
	{
		this.id=id;
		this.name=name;
		this.bill=bill;
	}
}
public class StreamDemo_Of_Customer {
public static void main(String[] args) {
	List<Customer> customersList=new ArrayList<>();
	customersList.add(new Customer(1,"Aryan",25000f));
	customersList.add(new Customer(2,"Ravi",30000f));
	customersList.add(new Customer(3,"Sailesh",28000f));
	customersList.add(new Customer(4,"Rohan",28000f));
	customersList.add(new Customer(5,"Raj",90000f));
	//filtering data
	customersList.stream().filter(Customer->Customer.bill>28000).forEach(Customer->System.out.println(Customer.name));
	
}
}

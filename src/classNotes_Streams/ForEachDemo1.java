package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
public static void main(String[] args) {
	List<String> cityList=new ArrayList<String>();
	cityList.add("Hyderabad");
	cityList.add("Nagpur");
	cityList.add("Kolkata");
	cityList.add("Bangalore");
	cityList.forEach(city->System.out.println(city));
}
}

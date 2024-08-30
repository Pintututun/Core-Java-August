package stream_api_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

public class FindAllDuplicateElements {
public static void main(String[] args) {
	List<Integer> myList=Arrays.asList(10,20,45,45,78,90);
	Map<Integer,Integer> frequency=new HashMap<>();
	Vector<Integer> v=new Vector(myList);
	for(int i=0;i<v.size();i++)
	{
		int count=1;
		for(int j=i+1;j<v.size();j++)
		{
			if(v.get(i)==v.get(j)&&v.get(i)!=null)
			{
				v.set(j, null);
				count++;
			}
		}
		frequency.put(v.get(i), count);
	}
	List<Integer> list=frequency.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	System.out.println(list);
}
}

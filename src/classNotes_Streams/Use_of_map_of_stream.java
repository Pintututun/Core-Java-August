package classNotes_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Use_of_map_of_stream {
public static void main(String[] args) {
	List<Player> listOfPlayers=createMyPlayerList();
	//Using map function to conver Stream<Player> to Stream<String>
	Set<String> listOfPlayerNames=listOfPlayers.stream().map(p->p.getName()).collect(Collectors.toSet());
	listOfPlayerNames.forEach(System.out::println);
}
public static List<Player> createMyPlayerList()
{
	List<Player> listOfPlayers=new ArrayList<>();
	Player p1=new Player("Rohit",29);
	Player p2=new Player("Virat",30);
	Player p3=new Player("K L Rahul",27);
	Player p4=new Player("Dhoni",34);
	Player p5=new Player("Sachin",37);
	Player p6=new Player("Rohit",37);
	Player p7=new Player("Virat",30);
	listOfPlayers.add(p1);
	listOfPlayers.add(p2);
	listOfPlayers.add(p3);
	listOfPlayers.add(p4);
	listOfPlayers.add(p5);
	listOfPlayers.add(p6);
    listOfPlayers.add(p7);
	return listOfPlayers;
}
}
class Player
{
	private String name;
	int age;
	
	public Player(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

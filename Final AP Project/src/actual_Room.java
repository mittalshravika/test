import java.io.Serializable;
import java.util.List;

public class actual_Room implements Serializable{
	
	private List<Week> list_Of_Weeks;
	private String name;
	private int capacity;
	
	public String get_Name() {
		return name;
	}
	
	public int get_Capacity() {
		return capacity;
	}
	
	public void add_List_Of_Weeks(List<Week> list_Of_Weeks)
	{
		
	}
	
	public void add_Room(List<actual_Room> global_Room_List)
	{
		
	}
}
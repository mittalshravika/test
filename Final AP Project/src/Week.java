import java.io.Serializable;
import java.util.List;

public class Week implements Serializable{

	private List<Day> week_List;
	private String name;
	
	String get_Name()
	{
		return name;	
	}
	
	void add_Week_List(List<Day> week_List)
	{
		
	}
	
}
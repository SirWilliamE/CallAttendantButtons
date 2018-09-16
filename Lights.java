
import java.util.ArrayList;

public class Lights
{
	static ArrayList <Integer> list; 
	
	public Lights()
	{
		list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
	} // End Constructor
		 
	public static void callAttendant(int seatNum) {
		
		if (list.get(seatNum) == 0) {
    		list.set(seatNum, 1);
    	}
    	else {
    		Lights.list.set(seatNum, 0);
    	}
	}
	
	public static void ClearAll() 
	{
		list.set(0, 0);
		list.set(1, 0);
		list.set(2, 0);
		list.set(3, 0);
		list.set(4, 0);
	}
}
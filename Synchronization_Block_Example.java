import java.util.ArrayList;
import java.util.List;

class Main
	{
	    String name = "";
	    public int count = 0;
	  
	    public void MainName(String Main, List<String> list)
	    {
	        // Only one thread is permitted
	        // to change geek's name at a time.
	        synchronized(this)
	        {
	            name = Main;
	            count++;  // how many threads change geek's name.
	        }
	  
	        // All other threads are permitted
	        // to add Main name into list.
	        list.add(Main);
	    }
	}
	  
	public class Synchronization_Block_Example 
	{
	    public static void main (String[] args)
	    {
	    	Main gk = new Main();
	        List<String> list = new ArrayList<String>();
	        gk.MainName("Rani", list);
	        System.out.println(gk.name);
	  
	    }
}

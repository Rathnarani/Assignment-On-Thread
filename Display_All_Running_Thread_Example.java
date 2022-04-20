import java.util.Set;

class GFGThread extends Thread {
	// overridden run method
    public void run()
    {
        System.out.println("Overridden Run Method");
    }
}
	    
	 
	public class Display_All_Running_Thread_Example {
	 
	    public static void main(String[] args)
	        {
	            // making a thread object
	            GFGThread t1 = new GFGThread();
	            GFGThread t2 = new GFGThread();
	            t1.start(); // starting the thread
	            t2.start();
	     
	            // getting the group of the threads/
	            ThreadGroup threadGroup
	                = Thread.currentThread().getThreadGroup();
	     
	            // getting the total active count of the threads
	            int threadCount = threadGroup.activeCount();
	     
	            Thread threadList[] = new Thread[threadCount];
	            // enumerating over the thread list
	            threadGroup.enumerate(threadList);
	     
	            System.out.println("Active threads are:");
	           
	            // iterating over the for loop to get the names of
	            // all the active threads.
	            for (int i = 0; i < threadCount; i++)
	                System.out.println(threadList[i].getName());
	        }  
	}
package CreatingThread;
// Extending the Thread class
import java.util.*;
public class Test extends Thread {

	public void run() {
		try {
			System.out.println("Thread " +Thread.currentThread().getId()+ " is running");
		} catch (Exception e) {
			System.out.println("System catch the exception");
		}
	}
	public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   int n = scn.nextInt();
	   
	   for(int i = 0 ; i < n; i++) {
		   Test test = new Test();
		   test.start();
	   }
		
	}
}

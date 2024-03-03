package CreatingThread;

import java.util.*;
public class Test2 implements Runnable{
 
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	// int[] arr = new int[n];
	 for(int i =0 ; i < n ; i++) {
		 Test2 test = new Test2();
		 Thread tread = new Thread(test);
		 tread.start();
	 }
	 
   }

	@Override
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		} catch (Exception e) {
			System.out.println("Thread catch the exception");
		}
		
	}

	
}

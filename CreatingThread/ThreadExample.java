package CreatingThread;

public class ThreadExample extends Thread {
	public int count = 0;

	public void run() {
		System.out.println("Runnable Thread starting");
		try {
			while (count < 5) {
				Thread.sleep(500);
				count++;
			}

		} catch (InterruptedException e) {
			System.out.println("Thraed Class Interrupted");
		}
		System.out.println("Thread Terminating");
	}

	public static void main(String[] args) {
		ThreadExample instance = new ThreadExample();
		instance.start();

		while (instance.count != 5) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

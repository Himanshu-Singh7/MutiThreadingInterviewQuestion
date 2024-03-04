package CreatingThread;

public class RunnableInterfaceExample implements Runnable {
	public int count = 0;

	@Override
	public void run() {

		System.out.println("Runnable Thread starting");

		try {
			while (count < 5) {
				Thread.sleep(500);
				count++;
			}

		} catch (InterruptedException e) {
			System.out.println("RunnableThraed Interrupted");
		}
		System.out.println("Runnable Thread is Terminating");
	}

	public static void main(String[] args) {
		RunnableInterfaceExample instance = new RunnableInterfaceExample();
		Thread tread = new Thread(instance);
		tread.start();
		while (instance.count != 5) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

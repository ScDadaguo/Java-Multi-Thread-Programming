package chapter01.section07.thread_1_7_1.project_1_t11;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 50000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}
}

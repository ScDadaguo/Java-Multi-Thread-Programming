package chapter01.section07.thread_1_7_3.project_1_t13;

public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(20);
			System.out.println("guohao");
			thread.interrupt();
			System.out.println("guohao2");
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}

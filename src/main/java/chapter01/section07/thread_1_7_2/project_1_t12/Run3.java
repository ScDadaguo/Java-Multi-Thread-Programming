package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run3 {
	
	public static void main(String[] args) {
		try {
			System.out.println("guohao");
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			System.out.println("guohao");
			thread.interrupt();
			System.out.println("是否停止1？="+thread.isInterrupted());
			System.out.println("是否停止2？="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
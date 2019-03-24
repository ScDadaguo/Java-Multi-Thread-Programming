package chapter04.section01.thread_4_1_7.project_1_ConditionTest;

public class MyThreadA extends Thread {

	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			myService.set();
		}
	}

}

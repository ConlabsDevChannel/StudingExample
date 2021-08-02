package dev.conlabs.sample.thread;

public class MainThread {

	public void threadrun() {
		// Thread를 2개 띄울거고
		SubThread thd1 = new SubThread();
		SubThread thd2 = new SubThread();

		System.out.println("메인 시작함");
		
		// Thread 2개를 스타트함
		thd1.start();
		thd2.start();
		
		// 두 Thread가 종료될때 까지 기다리도록 join 처리
		try {
			thd1.join();
			thd2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 종료가 되면 아래 항목을 돔
		System.out.println("메인 종료함");
	}
}

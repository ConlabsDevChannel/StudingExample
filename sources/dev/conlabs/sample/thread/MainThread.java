package dev.conlabs.sample.thread;

public class MainThread {

	public void threadrun() {
		// Thread를 2개 띄울거고
		SubThread thd1 = new SubThread();
		SubThread thd2 = new SubThread();

		System.out.println("메인 시작함");
		
		thd1.start();
		thd2.start();
		
		while(true) {
			
			try {
				// 1초마다 각 쓰레드가 살아있는지 체크
				Thread.sleep(1000);
				if(thd1.isAlive()) {
					System.out.println("THD1 >> " + thd1.keepGoing);
				}
				if(thd2.isAlive()) {
					System.out.println("THD2 >> " + thd2.keepGoing);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// 각 쓰레드가 종료되면 MainThread를 닫게 만들거
			// 혹시 쓰레드가 종료가 되서 확인을 못하는걸까?
			// 이러면 외부에 무언가를 두거나, 쓰레드에 무한루프를 줘서 살아있게 만들다가 플래그를 줘서 끝내거나
			
			if(!thd1.keepGoing && !thd2.keepGoing) {
				
				// 1번 쓰레드 종료
				thd1.interrupt();
				// 2번 쓰레드 종료
				thd2.interrupt();
				
				System.out.println("메인 종료함");
				
				// while문을 나감
				break;
			}
		}
	}
	
	// Thread를 2개 띄워서
	// 하나는 UDP 서버, 하나는 UDP 클라이언트
	
}

package dev.conlabs.sample.thread;

public class SubThread extends Thread {

	// 각 Thread에서 플래그를 줘서 메인이 주기적으로 체크를 하게 만들고
	public boolean keepGoing = true;
	
	@Override
	public void run() {
		System.out.println(this.getName() + " 시작");
		
		try {
			// 3초 뒤에 플래그를 false로 처리
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 거기서 둘다 상태가 종료가 나면
		keepGoing = false;
		System.out.println("keepGoing Set " + keepGoing);
		System.out.println(this.getName() + " 종료");
	}
	
}

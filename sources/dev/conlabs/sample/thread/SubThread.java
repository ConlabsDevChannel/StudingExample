package dev.conlabs.sample.thread;

public class SubThread extends Thread {

	@Override
	public void run() {
		int i = 0;
		
		while(true) {
			
			// 1초단위로 Sleep
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			
			System.out.println(this.getName() + " " + i + " 초 경과");
			
			// i가 3 이상이면 while문 종료
			if(i >= 3) {
				break;
			}
		}
		
		// 반복문이 종료되었으니 Thread 종료
	}
	
}

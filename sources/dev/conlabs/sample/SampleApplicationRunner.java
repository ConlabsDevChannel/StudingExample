package dev.conlabs.sample;

import dev.conlabs.sample.thread.MainThread;

public class SampleApplicationRunner {

	public static void main(String[] args) {
		
		MainThread mainRun = new MainThread();
		
		// 실행
		mainRun.threadrun();
	}
	
}

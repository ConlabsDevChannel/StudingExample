package com.arintv.conlabs.javainstruction04;

/* 2018.12.02, 무한 루프
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class InfiniteLoop {

	public static void main(String[] args) {
		int a = 0;
		
		// while을 이용한 무한 루프
		while(true) {
			System.out.println(a++);
		}
		
		/* for를 이용한 무한 루프
		 * 만약 두개의 문장에 주석 처리를 제외할 경우 아래 for 문은 접근할 수 없다
		for(;true;) {
			System.out.println(a++);
		}*/
	}
}
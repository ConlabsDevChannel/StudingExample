package com.arintv.conlabs.javainstruction04;

/* 2018.12.02, while 문과 do.. while 문의 차이
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class DifferenceWhile {

	public static void main(String[] args) {
		// while 문장은 반복을 조건식이 참이면 반복을 진행합니다.
		int flags = 0;
		int a = 0;
		
		while(flags < 5) {
			a = a + 2;
			System.out.print(a + " ");
			flags++;
		}
		
		System.out.println("\nflags의 현재 값: " + flags);
		// do while 문장은 무조건 1회는 실행합니다.
		do {
			a = a + 2;
			System.out.print(a + " ");
			flags++;
		} while(flags < 5); // flags의 값이 6이 되어 조건을 만족하지 않으므로 반복을 실행하지 않습니다.
		System.out.println("\nflags의 현재 값: " + flags);
	}

}

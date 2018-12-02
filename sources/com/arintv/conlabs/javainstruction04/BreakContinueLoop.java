package com.arintv.conlabs.javainstruction04;

/* 2018.12.02, 반복문의 탈출과 스킵
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class BreakContinueLoop {

	public static void main(String[] args) {
		int a = 0;
		
		while(true) {
			if(a == 10)
				break; // a의 값이 10이 되면 현재 반복문을 탈출합니다.
			
			a++; // a를 1씩 증가합니다.
			System.out.print("반복 " + (a) + "회차: ");
			
			if(a == 3 || a == 6 || a == 9) {
				System.out.println("");
				continue; // a가 3, 6, 9인 경우 이 시점에서 다음 반복문으로 이동합니다.
			}
			System.out.println(a);
		}

	}

}

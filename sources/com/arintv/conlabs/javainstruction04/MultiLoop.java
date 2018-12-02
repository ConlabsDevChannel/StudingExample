package com.arintv.conlabs.javainstruction04;

/* 2018.12.02, 다중 반복문
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class MultiLoop {

	public static void main(String[] args) {
		
		// 다중 반복문의 대표, 계단식 별 찍기 예제입니다.
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*"); // 내부 반복문이 되는 횟수만큼 별을 찍어냅니다.
			}
			System.out.println(""); // 내부 반복문이 끝나면 줄을 띄우고 다음 반복문으로 넘어갑니다.
		}
	}
}

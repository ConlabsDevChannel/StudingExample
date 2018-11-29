package com.arintv.conlabs.javainstruction04;

/* 2018.11.29, 가장 기초적인 반복문
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class BasicAddRepeat {

	public static void main(String[] args) {
		// 곱셈은 덧셈을 정해진 숫자만큼 반복합니다.
		int a = 3;
		int result = 0;
		int resultmulti = 0;
		
		result = a + a + a + a + a + a + a + a + a + a; // a를 단순히 10번 더한 것
		resultmulti = a * 10; // a에 10을 곱한 것
		
		System.out.println(result);
		System.out.println(resultmulti);
		
		// 반복문에 사용하는 키워드는 while과 for입니다.
		// while(조건식)은 조건식을 만족하지 않을 때까지 무한정 실행합니다.
		result = 0;
		int flags = 0; // 반복문의 조건
		
		while(flags != 10) { // flags가 10이 아닐때 while 문의 문장을 실행합니다.
			result = result + a;
			flags++; // 플래그를 1씩 증가시킵니다. 반복 문장을 실행할 때마다 증가하므로 결국 flags는 10이 되어 반복문을 탈출합니다.
		}
		System.out.println(result);
		
		// for(초기식; 조건식; 증감식)
		result = 0;
		for(flags = 0; flags != 10; flags++) // flags의 초기값은 0, flags가 10이 아니라면 문장을 실행하고 문장이 끝나면 flags를 1씩 증가합니다.
			result = result + a;
		System.out.println(result);
		
	}

}

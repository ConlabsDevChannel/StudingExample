package com.arintv.conlabs.javainstruction02;

/* 2018.11.11, 변수와 상수의 개념 익히기
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class StaticVariableError {

	public static void main(String[] args) {
		// 상수는 final 키워드를 이용합니다.
		// 이 상수는 고정된 숫자로, 향후에 수정이 불가능합니다.
		
		final int a = 50; // 정수형 a 상수는 50으로 고정

		// a = 20; // 컴파일러 오류! 고정된 숫자는 변경할 수 없습니다.
	}

}

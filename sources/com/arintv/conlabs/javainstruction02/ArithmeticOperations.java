package com.arintv.conlabs.javainstruction02;

/* 2018.11.11, 변수와 상수의 개념 익히기
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class ArithmeticOperations {

	public static void main(String[] args) {
		// 프로그래밍 언어에서 사용하는 사칙연산 키워드는 +, -, *, / 와 나머지 연산 % 입니다.
        System.out.println(3+5);
        System.out.println(3*5);
        System.out.println(3-5);
        System.out.println(3/5);
        System.out.println(3%5);
        
        // 위 5개 문장은 변수를 이용해 표현할 수 있습니다.
        int result; // 정수형 변수 result, 이 변수는 정수형인 숫자만 들어갈 수 있습니다.
        
        result = 3 + 5; // 사칙연산을 변수에 저장
        System.out.println(result); // 변수를 직접 출력
        result = 3 * 5;
        System.out.println(result);
        result = 3 - 5;
        System.out.println(result);
        // 3/5 의 결과는 상식적으로 0.6이 나와야 합니다. 과연 여기서도 그럴까요?
        result = 3 / 5; 
        System.out.println(result);
        result = 3 % 5;
        System.out.println(result);
        
        // 변수는 정수형뿐만 아니라 실수형 숫자도 존재합니다.
        // 변수는 선언과 동시에 초기화를 하거나, 선언 후에 특정 값을 입력하는 방법이 있습니다.
        double result2;
        double c = 3.0;
        double d;
        d = 5.0;
        
        int a = 3;
        int b;
        b = 5;
        
        result2 = a + b;
        System.out.println(result2);
        result2 = a * b;
        System.out.println(result2);
        result2 = a - b;
        System.out.println(result2);
        result2 = c / d; // 정수형이 아닌, 실수형을 입력한 결과는 위와 달라질까요?
        System.out.println(result2);
        result2 = c % d;
        System.out.println(result2);
    }
	
}

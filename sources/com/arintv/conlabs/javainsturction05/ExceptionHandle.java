package com.arintv.conlabs.javainsturction05;

/* 2018.12.19, 기본적인 예외 처리
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * IntelliJ의 경우 하단의 설정을 UTF-8로 변경합니다.
 *
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class ExceptionHandle {

    public static void main(String[] args) {
        int a = 50;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없음");
        }

        int numbers[] = new int[3];

        for (int i = 0; i < 4; i++) {
            numbers[i] = i;
            try {
                System.out.println(numbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

}

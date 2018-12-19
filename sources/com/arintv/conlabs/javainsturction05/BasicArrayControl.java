package com.arintv.conlabs.javainsturction05;

/* 2018.12.18, 배열을 다루는 방법
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * IntelliJ의 경우 하단의 설정을 UTF-8로 변경합니다.
 *
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class BasicArrayControl {

    public static void main(String[] args) {

        int[][] numbers = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = i+j;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

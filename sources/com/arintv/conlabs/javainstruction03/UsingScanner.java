package com.arintv.conlabs.javainstruction03;

import java.util.Scanner;

/* 2018.11.25, 스캐너 클래스를 이용해 키보드로 읽기
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class UsingScanner {
     
    public static void main(String[] args) {
        
        // 키보드 등의 입력은 스트림을 이용해 바이트단위로 읽어들입니다.
        // Scanner 클래스는 키보드를 통해 들어오는 스트림을 값에 입력하는 클래스입니다.
        // new 명령어를 이용해 Scanner 클래스를 사용할 수 있도록 변수 scanner로 인스턴스화합니다.
        Scanner scanner = new Scanner(System.in);
        
        double result;
        
        // 정수형은 nextInt();를 이용해 입력합니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 실수형은 nextDouble();을 이용해 입력합니다.
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        
        result = a + b;
        System.out.println(result);
        result = a * b;
        System.out.println(result);
        result = a - b;
        System.out.println(result);
        result = c / d;
        System.out.println(result);
        result = c % d;
        System.out.println(result);
        
        scanner.close();
    }
}

package com.arintv.conlabs.javainstruction03;

import java.util.Scanner;

/* 2018.11.25, if.. else 문을 이용한 자판기 만들기
 * 이 소스는 UTF-8로 인코딩합니다. 만약 이 문장이 깨질 경우 아래 경로를 이용하면 정상적으로 표시됩니다.
 * 프로젝트 마우스 오른쪽 버튼 - Properties - Resources - Text file encoding - Other: UTF-8
 * 
 * 2018 (C) ARINTV Contents Creation Labs.
 * 본 소스는 ARINTV ARCHIVE에 게시중인 "자바, 어디까지 가봤니" 프로젝트의 일부입니다.
 * 이 소스는 GitHub ARINTVConLabs/StudingExample에서 확인하실 수 있습니다. */

public class VendingMachine {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input_money = 0; // 자판기에 들어갈 돈
        int left_money = 0; // 사용하고 남은 돈
        
        int selected_item_no = 0; // 선택한 메뉴 항목
        
        final int appleJuice = 600; // 사과 주스의 금액은 600원
        final int grapeJuice = 300; // 포도 주스의 금액은 300원
        final int cider = 500; // 사이다의 금액은 500원
        
        String selectedItemName = null;
        boolean itemSuccessPurchased = false; // 성공적으로 구매했을 경우의 플래그
        
        // 메뉴표 보여주기
        System.out.println("음료수 자판기");
        System.out.println("가격표---------------");
        System.out.println("상품명\t\t가격");
        System.out.println("1. 사과 주스\t" + appleJuice);
        System.out.println("2. 포도 주스\t" + grapeJuice);
        System.out.println("3. 사이다\t" + cider);
        System.out.println("---------------------");
        
        // 돈 넣기
        System.out.print("금액을 투입하여 주십시오: ");
        input_money = sc.nextInt();
        
        // 메뉴 선택하기
        System.out.println("현재 금액은 " + input_money + "입니다.");
        System.out.print("음료수를 선택해 주십시오(1~3): ");
        selected_item_no = sc.nextInt();
        
        left_money = input_money; // 처음 넣은 돈 자체는 남은 돈과 같다.
        
        if(selected_item_no == 1) { // 1번 항목을 선택하면
            System.out.println("선택한 음료수는 사과 주스 입니다.");
            if(input_money >= appleJuice) { // 만약 사과주스를 살 돈이 충분할 때
                left_money = input_money - appleJuice; // 남은 돈에 들어온 돈에서 사과주스만큼을 제외한다
                selectedItemName = "사과 주스";
                itemSuccessPurchased = true;
            } else {
                System.out.println("투입한 금액이 부족합니다.");
            }
        } else if (selected_item_no == 2) { // 2번 항목을 선택하면
            System.out.println("선택한 음료수는 포도 주스 입니다.");
            if(input_money >= grapeJuice) {
                left_money = input_money - grapeJuice;
                selectedItemName = "포도 주스";
                itemSuccessPurchased = true;
            } else {
                System.out.println("투입한 금액이 부족합니다.");
            }
        } else if (selected_item_no == 3) {
            System.out.println("선택한 음료수는 사이다 입니다.");
            if(input_money >= cider) { // 3번 항목을 선택하면
                left_money = input_money - cider;
                selectedItemName = "사이다";
                itemSuccessPurchased = true;
            } else {
                System.out.println("투입한 금액이 부족합니다.");
            }
        } else {
            System.out.println("선택한 메뉴가 없습니다.");
        }
        
        if(itemSuccessPurchased == true) { // 구매가 정상적으로 이루어지면 출력할 음료수 이름
            System.out.print("음료수 " + selectedItemName + "와 ");
        }
        
        System.out.println("반환 금액은 " + left_money + "입니다.");
        
    }
 
}
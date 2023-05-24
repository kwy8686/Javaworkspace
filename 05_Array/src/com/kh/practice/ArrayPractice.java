package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
		String[] i = new String[5];
		
		i[0] = "사과";
		i[1] = "포도";
		i[2] = "바나나";
		i[3] = "수박";
		i[4] = "블루베리";
		
		System.out.println(i[0]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		
		int sum = 0;
		
		System.out.print("정수 : ");
		int input = Integer.parseInt(sc.nextLine());
		
		int[] num = new int[input];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			num[i] = Integer.parseInt(sc.nextLine());
			sum += num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println(sum);
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		
		String[] menu = {"짜장면", "짬뽕", "탕수육", "깐풍기", "유산슬", "양장피"};
		
		System.out.print("메뉴 : ");
		String input = sc.nextLine();
		
		boolean a = false;
		
		for(int i=0; i<menu.length; i++) {
			if(menu[i].equals(input)) {
			a = true;
			break;
			} 
		}
		if(a == true) {
			System.out.println("배달 가능");
		} else {
			System.out.println("배달 불가능");
		}
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		System.out.print("주민등록번호 : ");
		String input = sc.nextLine();
		
		char[] input2 = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) { // 이렇게
			input2[i] = input.charAt(i);
		}
		
		for(int i = 0; i < input.length(); i++) { // 조건식이 같다면 하나로 합치는 게 좋아요!
			if(i < 8) {
			System.out.print(input2[i]);
			} else {
				System.out.print("*");
			}
		}
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
		System.out.print("단어 입력 : ");
		String input = sc.nextLine();
		
		char[] input2 = new char[input.length()];
		
		for(int i = input.length()-1; i >= 0; i--) { 
			input2[i] = input.charAt(i);
			System.out.print(input2[i]);
		}
		
		for(int i = input.length()-1; i >= 0; i--) { // 여기 for문 생략해도 답이 나올거에요!
			System.out.print(input2[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayPractice array = new ArrayPractice();
		array.method1();
		array.method2();
		array.method3();
		array.method4();
		array.method5();
		
		
	}
	
}

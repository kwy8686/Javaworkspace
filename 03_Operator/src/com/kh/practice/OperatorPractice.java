package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
	
		OperatorPractice op = new OperatorPractice();
//		op.method1();
//		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
		op.method6();
	}
	
	public void method1() {
		
		int i = 0;
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : " );
		i = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		x = sc.nextInt();
		
		int num1 = x / i;
		int num2 = x % i;

		System.out.println("1인당 연필 개수 : " + num1);
		System.out.println("남는 연필 개수 : " + num2);
	}
	
	public void method2() {
		
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 : ");
		i = sc.nextInt();
		
		int num1 = i / 100;
		System.out.println(num1 + "00");
		
		
	}
	
	public void method3() {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		num3 = sc.nextInt();
		
		boolean result = ((num1 == num2) && (num2 == num3)) ? true : false;
		System.out.println(result);
	}
	
	public void method4() {
		
		int num1 = 0;
		int num2 = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num1 = sc.nextInt();
		
		result = ((num1 % 2) == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	
	public void method5() {
		
		int num1 = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		num1 = sc.nextInt();
		
		result = (num1 <= 13) ? "어린이" : (num1 <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
	}
	
	public void method6() {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		num2 = sc.nextInt();
		
		num3 = ((num1 % num2) != 0) ? num1 / num2 + 1 : num1 / num2;
		System.out.println(num3);
		
	}
	

}

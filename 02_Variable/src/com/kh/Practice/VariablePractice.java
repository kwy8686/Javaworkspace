package com.kh.Practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
	
public static void main(String[] args) {
		
		VariablePractice vp = new VariablePractice();
//		vp.method1();
//		vp.method2();
//		vp.method3();
		vp.method4();
		
	}

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();

		System.out.println("더하기 결과 : " + ( num1 + num2 ) );
		System.out.println("빼기 결과 : " + ( num1 - num2 ) );
		System.out.println("곱하기 결과 : " + ( num1 * num2 ) );
		System.out.println("나누기 몫 결과 : " + ( num1 / num2 ) );
		
	}
	
	public void method2() {
		
		int num1 = 10000;
		int num2 = 7000;
		
		System.out.println("성인 2명 : " + (num1 * 2));
		System.out.println("청소년 3명 : " + (num2 * 3));
		
		System.out.println("총 금액 : " + (num1 * 2 + num2 * 3));
				
		
	}
	
	public void method3() {
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		int a = 0;
		a = x;
		x = y;
		y = z;
		z = a;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 :");
		String text = sc.nextLine();
		char first = text.charAt(0);
				
		System.out.println("첫번째 문자 : " + first);
		
		char last = text.charAt(-1);
		
		System.out.println("마지막 문자 : " + last);
	}

}

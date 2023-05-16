package com.kh.Practice;

import java.util.Scanner;

public class CastingPractice {
	
	public static void main(String[] args) {
		
		CastingPractice vp = new CastingPractice();
//		vp.method1();
		vp.method2();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String i = sc.nextLine();
	
		System.out.println("A unicode : " + (int)i);
		System.out.println("A unicode : " + (num + 1));
	
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int i = sc.nextInt();
		
		System.out.print("영어 : ");
		int x = sc.nextInt();
		
		System.out.print("수학 : ");
		int z = sc.nextInt();
		
		System.out.println("총점 : " +  (i + x + z));
		System.out.println("평균 : " +  ((i + x + z) / 3));
		
	}

}

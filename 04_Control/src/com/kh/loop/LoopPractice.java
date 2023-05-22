package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
 
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {
    	
    	int input = 0;
    	
    	System.out.print("사용자 입력 : ");
    	input = sc.nextInt();
    	
    	for(int i = input; i >= 1; i--) {
    		System.out.println(i);
    	}

    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
    	
    	int num1 = 1;
    	int num2 = -2;
    	int num3 = num1 + num2;
    	
    	while(num3 < 100) {
    		
    		if(num1 < num2 * -1) {
    		System.out.print(num1);
    		num1 += 2; 
    		num3 += num1;
    		} else {
			System.out.print("(" + num2 + ")");	
			num2 -= 2;
			num3 += num2;
    		}
    		
    		if(num3 < 100) {
    			System.out.print("+");	
    		}
    	}
    	System.out.println();
    	System.out.println("총합 : " + num3);
    }

    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	
    	System.out.print("문자열 : ");
    	String i = sc.nextLine();
    	
    	System.out.print("문자 : ");
    	char x = sc.next().charAt(0);
    	
    	int result = 0;
    	
    	for(int num = 0; num < i.length(); num++) {
    		if(x == i.charAt(num)) {
    			result++;
    		}
    	}
    	System.out.println(i + " 안에 포함된 " + x + " 개수 : " + result);
    }

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용! 1~10)
        7
        3
        4
        2
        3
        4
        0
     */
    public void method4() {
    	
    	double random = Math.random() * 10;
    	random = (int) random;
    	
    	while(random != 0) {
    		System.out.printf("%.0f\n", random);
    		random = Math.random() * 10;
    		random = (int) random;
    	}
    	System.out.printf("%.0f", random);
    }

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {
    	
    	int num1 = 0;
    	int num2 = 0;
    	int num3 = 0;
    	int num4 = 0;
    	int num5 = 0;
    	int num6 = 0;
    	
    	for(int i = 0; i < 10; i++) {
    	
		double random = Math.random() * 5 + 1;
    		
    		switch((int) random) {
    		case 1:
    			num1++;
    			break;
    		case 2:
    			num2++;
    			break;
    		case 3:
    			num3++;
    			break;
    		case 4:
    			num4++;
    			break;
    		case 5:
    			num5++;
    			break;
    		case 6:
    			num6++;
    			break;
    		}
    	}
    	System.out.println("1 : " + num1);
    	System.out.println("2 : " + num2);
    	System.out.println("3 : " + num3);
    	System.out.println("4 : " + num4);
    	System.out.println("5 : " + num5);
    	System.out.println("6 : " + num6);
    }

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	
    	int lose = 0;
    	int draw = 0;
    	int win = 0;
    	
    	System.out.print("당신의 이름을 입력해주세요 : ");
    	String name = sc.nextLine();
    	
    	String computer = null;
    	
    	boolean run = true;
    	
    	while(run) {
    		
    		System.out.print("가위바위보 : ");
        	String input = sc.nextLine();
    		
    		int random = (int) (Math.random() * 3) + 1;
    		if(random == 1) {
    			computer = "가위";
    		} else if(random == 2) {
    			computer = "바위";
    		} else {
    			computer = "보";
    		}
    		
    		switch(input) {
    		case "가위":
    			if(computer == "가위") {
    				System.out.println("컴퓨터 : 가위");
    				System.out.println(name + " : " + input);
    				System.out.println("비겼습니다");
    				draw++;
    			} else if(computer == "바위") {
    				System.out.println("컴퓨터 : 바위");
    				System.out.println(name + " : " + input);
    				System.out.println("졌습니다ㅠㅠ");
    				lose++;
    			} else {
    				System.out.println("컴퓨터 : 보");
    				System.out.println(name + " : " + input);
    				System.out.println("이겼습니다!");
    				win++;
    				run = false;
    				break;
    			}
			case "바위":
				if(computer == "가위") {
    				System.out.println("컴퓨터 : 가위");
    				System.out.println(name + " : " + input);
    				System.out.println("이겼습니다!");
    				win++;
    				run = false;
    				break;
    			} else if(computer == "바위") {
    				System.out.println("컴퓨터 : 바위");
    				System.out.println(name + " : " + input);
    				System.out.println("비겼습니다");
    				draw++;
    			} else {
    				System.out.println("컴퓨터 : 보");
    				System.out.println(name + " : " + input);
    				System.out.println("졌습니다ㅠㅠ");
    				lose++;
    			}
			case "보":
				if(computer == "가위") {
    				System.out.println("컴퓨터 : 가위");
    				System.out.println(name + " : " + input);
    				System.out.println("졌습니다ㅠㅠ");
    				lose++;
    			} else if(computer == "바위") {
    				System.out.println("컴퓨터 : 바위");
    				System.out.println(name + " : " + input);
    				System.out.println("이겼습니다!");
    				win++;
    				run = false;
    				break;
    			} else {
    				System.out.println("컴퓨터 : 보");
    				System.out.println(name + " : " + input);
    				System.out.println("비겼습니다");
    				draw++;
    			}
    		}
    	}
    	System.out.println("이긴 횟수 : " + win);
    	System.out.println("진 횟수 : " + lose);
    	System.out.println("비긴 횟수 : " + draw);
    }

    
    public static void main(String[] args) {
    	LoopPractice e = new LoopPractice();
//    	e.method1();
//    	e.method2();
//    	e.method3();
//    	e.method4();
//    	e.method5();
    	e.method6();
    }

}
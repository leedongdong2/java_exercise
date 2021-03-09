package IfSwitchForWhile;

import java.util.Scanner;
//1~100까지의 수 업앤다운 게임
public class Exam4_14 {

	public static void main(String[] args) {
	int answer = (int)((Math.random()*100)+1);
	System.out.println(answer);
	int input = 0;
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	do {
		count++;
		System.out.println("1과 100사이의 값을 입력하세요:");
		input = sc.nextInt();
		if(input>answer) {
			System.out.println("더작은수를 입력하세요");
		}else if(input<answer) {
			System.out.println("더큰수를 입력하세요");
		}else if(input==answer) {
			break;
		}
	}while(true);
	System.out.println("정답");
		
  
	}

}

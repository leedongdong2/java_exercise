package IfSwitchForWhile;

import java.util.Scanner;
//1~100������ �� ���شٿ� ����
public class Exam4_14 {

	public static void main(String[] args) {
	int answer = (int)((Math.random()*100)+1);
	System.out.println(answer);
	int input = 0;
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	do {
		count++;
		System.out.println("1�� 100������ ���� �Է��ϼ���:");
		input = sc.nextInt();
		if(input>answer) {
			System.out.println("���������� �Է��ϼ���");
		}else if(input<answer) {
			System.out.println("��ū���� �Է��ϼ���");
		}else if(input==answer) {
			break;
		}
	}while(true);
	System.out.println("����");
		
  
	}

}

package IfSwitchForWhile;

import java.util.Scanner;

public class Exam4_15 {
//ȸ�������� �Ǻ��ϴ� �ڵ带 �ϼ���Ű�ÿ�
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			String number = sc.nextLine();
			sc.close();
			int num = Integer.parseInt(number);
			int tmp = num;	
			int result = 0;
		 
			while(tmp!=0) {	
				result = (result*10)+(tmp%10);
				tmp=tmp/10;
			}
		if(num == result) {
			System.out.println(number +"=ȸ�����Դϴ�");
		} else {
			System.out.println(number +"=ȸ�������ƴմϴ�");
		}
			
			}
		}
		/*
		  0*10 = 0                 
		               +
		12321%10 = 1 ??             result*10
		tmp%10 = result

		12321/10 = 1232.1             +
		tmp/10 = tmp, tmp%10 = (result)2*10  20
		1232.1/10 = 123.21           +                       *10
		tmp/10 = tmp, tmp%10 = (result)3*100  300
		123.21 = 12.321             +                          *10
		tmp/10 = tmp, tmp%10 = (result)2*1000  2000
		12.321 = 1.2321            +                               *10
		tmp/10 = tmp, tmp%10 = (result)1*10000 10000
		     
		1*10


		*    
		*
		*/

	



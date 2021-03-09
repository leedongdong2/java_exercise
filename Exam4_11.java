package IfSwitchForWhile;

public class Exam4_11 {
// 피보나치 수열의 10번쨰 수는 무엇인기 계산하는 프로그램을 작성하시오
// 피보나치 수열 앞의 두수를 더하면 뒤에 수가 나오는 수열
	public static void main(String[] args) {
			int num1 = 1;
		    int num2 = 1;
		    int num3 = 0;
		     System.out.print(num1 + "," +num2);    
		    for(int i = 0;i<8;i++) {
		    	num3 = num1 + num2;
		    	System.out.print(","+num3);
		    	num1 = num2;    	
		    	num2 = num3;
		    }
		    }
			
		/*   1  +  1   =  2               → 이미 2개의 값은 나와잇으니 10번쨰는 10에서 2를 뺸 8번 반복횟수가 나온다
		 * num1 + num2 = num3
		 *   1  +  2   = 3
		 * num1 + num2 = num3
		 * num1 + num3                     → 대각선으로 값이 내려와서 대입된다
		 *   2  +  3   = 5
		 * num1 + num2 = num3
		 *  =      =
		 * num2 + num3 
		 *   3  +  5   = 8
		 * num1 + num2 = num3
		 *   =     =
		 * num2 + num3 
		 * 
		 * 5 + 8 = 13
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	

}

package IfSwitchForWhile;

public class Exam4_11 {
// �Ǻ���ġ ������ 10���� ���� �����α� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
// �Ǻ���ġ ���� ���� �μ��� ���ϸ� �ڿ� ���� ������ ����
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
			
		/*   1  +  1   =  2               �� �̹� 2���� ���� ���������� 10������ 10���� 2�� �A 8�� �ݺ�Ƚ���� ���´�
		 * num1 + num2 = num3
		 *   1  +  2   = 3
		 * num1 + num2 = num3
		 * num1 + num3                     �� �밢������ ���� �����ͼ� ���Եȴ�
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

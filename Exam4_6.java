package IfSwitchForWhile;

public class Exam4_6 {

	public static void main(String[] args) {
		//�ΰ��� �ֻ����� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϱ�
		for(int i=1;i<=6;i++) {
		   for(int j=1;j<=6;j++) {
			   if(i+j==6) {
				   System.out.printf("%d+%d=%d",i,j,i+j);
				   System.out.println();
			   }
		   }
		}

	}

}

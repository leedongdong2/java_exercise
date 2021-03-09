package IfSwitchForWhile;

public class Exam4_6 {

	public static void main(String[] args) {
		//두개의 주사위중 눈의 합이 6이 되는 모든 경우의 수를 출력하기
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

package Array;

import java.util.Arrays;

public class ArrayExam5_11 {

	public static void main(String[] args) {
	//�־��� 2���� �迭�� �����ͺ��� ���ο� ������ 1�� �� ū �迭�� �����ؼ�
	//��� �� ������ ����� �� ���� ���� ������ �����ϰ� ����϶�
	int[][] score = {
			{100,100,100}
		,   {20,20,20}
		,   {30,30,30}
		,   {40,40,40}
		,   {50,50,50}
		
	};
	 int [][] result = new int[score.length+1][score[0].length+1];
	 
	 for(int i=0;i<score.length;i++) {
		 for(int j=0;j<score[i].length;j++) {
			 result[i][j] = score[i][j];
		 }
	 }
	 
	 for(int i=0;i<result.length-1;i++) {
		 for(int j=0;j<result[j].length-1;j++) {
			 result[i][3] = result[i][3] + result[i][j];
		 }
	 }
	 
	 for(int i=0;i<result[i].length;i++) {
		 for(int j=0;j<result.length-1;j++) {
			 result[5][i] = result[5][i] + result[j][i];
		 }
	 }
	 
System.out.println(Arrays.deepToString(result));
	 
	 
	 
	 
	 
	}

}

package Array;

import java.util.Arrays;

public class ArrayExam5_5 {
// 1~9������ �ߺ������ʴ� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ �ڵ�
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr1 = new int[3];
		int tep = 0;
		
		for(int i=0;i<arr.length;i++) {
			int j = (int)(Math.random()*9);
			tep = arr[0];
			arr[0] = arr[j];
			arr[j] = tep;
		}
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        for(int i=0;i<arr1.length;i++) {
        	System.out.print(arr1[i]);
        }
	}

}

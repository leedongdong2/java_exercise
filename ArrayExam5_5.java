package Array;

import java.util.Arrays;

public class ArrayExam5_5 {
// 1~9사이의 중복되지않는 숫자로 이루어진 3자리 숫자를 만들어내는 코드
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

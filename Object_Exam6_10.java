package Object_orientde_Programming1;

import java.util.Arrays;
//주어진 배열에 담긴 값의 위치를 바꾸는 메소드를 작성하고 테스트해라
public class Object_Exam6_10 {
int tep = 0;	 
int te;
int te2;

 int[] suffle(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		te = (int)(Math.random()*arr.length);
		te2 = (int)(Math.random()*arr.length);
		tep = arr[te2];
		arr[te2] = arr[te];
		arr[te] = tep;
	}
	return arr;
}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
	   System.out.println(Arrays.toString(arr));
	   Object_Exam6_10 a = new Object_Exam6_10();
	   a.suffle(arr);
	   System.out.println(Arrays.toString(arr));
	  
	}

}

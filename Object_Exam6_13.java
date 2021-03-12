package Object_orientde_Programming1;

import java.util.Arrays;

public class Object_Exam6_13 {
// 주어진 인트형의 배열의 값 중에서 제일 큰값을 반환하고
// 주어진 배열의 크기가 null이거나 0인 경우, -99999를 반환하는 메서드를 작성하고 테스트하시오
	public static void main(String[] args) {
		Object_Exam6_13 c = new Object_Exam6_13();
	int[] data = {3,2,4,7,8};
	System.out.println(Arrays.toString(data));
	System.out.println("최대값:"+c.max(data));
	System.out.println("최대값:"+c.max(null));
	System.out.println("최대값:"+c.max(new int[] {}));

	}
	
int max(int[] arr) {
int blank = 0;
if(arr==null||arr.length==0) {
	blank = -99999;
	return -blank;
	}

    int max = arr[0];
	for(int i =1;i<arr.length;i++) {
		if(max<arr[i]) {
			max = arr[i];
		}
	}
	return max;
}



}



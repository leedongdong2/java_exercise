package Object_orientde_Programming1;

import java.util.Arrays;

public class Object_Exam6_13 {
// �־��� ��Ʈ���� �迭�� �� �߿��� ���� ū���� ��ȯ�ϰ�
// �־��� �迭�� ũ�Ⱑ null�̰ų� 0�� ���, -99999�� ��ȯ�ϴ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�
	public static void main(String[] args) {
		Object_Exam6_13 c = new Object_Exam6_13();
	int[] data = {3,2,4,7,8};
	System.out.println(Arrays.toString(data));
	System.out.println("�ִ밪:"+c.max(data));
	System.out.println("�ִ밪:"+c.max(null));
	System.out.println("�ִ밪:"+c.max(new int[] {}));

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



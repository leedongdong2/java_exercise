package IfSwitchForWhile;


public class Exam4_4 {

	public static void main(String[] args) {
		//1+(-2)+3+(-4)... �������� ����� ���ؾ� ������ 100�̻��̵Ǵ���
		int sum = 0;
		int s = -1;
		int num = 0;
		for(int i=1;sum<100;i++) {
			if(i%2!=0) {
				sum = sum + i;
				num = i;
			}else if(i%2==0) {
				sum = sum + s*i;
				num = i;
			}
			
	
	}
		System.out.println(sum);
		System.out.println(num);
}
}

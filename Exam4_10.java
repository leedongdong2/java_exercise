package IfSwitchForWhile;

public class Exam4_10 {
//���ڿ��� "12345"��� ���ڿ��� �� ���� ����� 15�� ����϶�
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i) - '0';
		}
       System.out.println("sum="+sum);
	}

}

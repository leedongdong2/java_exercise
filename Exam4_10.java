package IfSwitchForWhile;

public class Exam4_10 {
//문자열이 "12345"라면 문자열을 다 더한 결과인 15를 출력하라
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i) - '0';
		}
       System.out.println("sum="+sum);
	}

}

package IfSwitchForWhile;
//주어진 문자열이 숫자인지를 판별하는 프로그램을 알맞은 코드를 넣어 완성시키시오
public class Exam4_13 {

	public static void main(String[] args) {
    String val = "12o34";
    char ch = ' ';
    boolean isNumber = true;
    //문자로 들어갈수 있는 숫자는 0~9까지 이므로
    //문자가 0~9중의 하나의 값이라면 숫자이고 아니면 문자일 것이다.
    //charAt로 모든 문자들을 비교하여 하나라도 문자라면 그 문자열은 숫자로만 이루어져 있지 않다
    for(int i=0;i<val.length();i++) {
    	ch = val.charAt(i);
    	if(!('0'<=ch&&ch<='9')) {
    		isNumber = false;
    		break;
    	}
    }
   if(isNumber) {
	   System.out.println(val+"는 숫자입니다");
   }else { 
	   System.out.println(val+"는 숫자가아닙니다");
   }
    
	}

}

package IfSwitchForWhile;
//�־��� ���ڿ��� ���������� �Ǻ��ϴ� ���α׷��� �˸��� �ڵ带 �־� �ϼ���Ű�ÿ�
public class Exam4_13 {

	public static void main(String[] args) {
    String val = "12o34";
    char ch = ' ';
    boolean isNumber = true;
    //���ڷ� ���� �ִ� ���ڴ� 0~9���� �̹Ƿ�
    //���ڰ� 0~9���� �ϳ��� ���̶�� �����̰� �ƴϸ� ������ ���̴�.
    //charAt�� ��� ���ڵ��� ���Ͽ� �ϳ��� ���ڶ�� �� ���ڿ��� ���ڷθ� �̷���� ���� �ʴ�
    for(int i=0;i<val.length();i++) {
    	ch = val.charAt(i);
    	if(!('0'<=ch&&ch<='9')) {
    		isNumber = false;
    		break;
    	}
    }
   if(isNumber) {
	   System.out.println(val+"�� �����Դϴ�");
   }else { 
	   System.out.println(val+"�� ���ڰ��ƴմϴ�");
   }
    
	}

}

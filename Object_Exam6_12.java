package Object_orientde_Programming1;

public class Object_Exam6_12 {
//�־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
//��� ���ڷθ� �̷���������� Ʈ�縦 ��ȯ �ƴϸ� �޽��� ��ȯ�Ѵ�	
	public static void main(String[] args) {
		Object_Exam6_12 is = new Object_Exam6_12();
		String str = "3";
		System.out.println(str+"�� �����Դϰ�?"+is.isNumber(str));
		
		str = "1234o";
		System.out.println(str+"�� �����Դϰ�?"+is.isNumber(str));
		
		str = "";
		System.out.println(str+"�� �����Դϰ�?"+is.isNumber(str));

	}
public boolean isNumber(String str) {
	boolean check=true;
	
    if(str==null||str.equals("")) {
		check = false;
		return check;
	}
		
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch<'0'||ch>'9') {
			check = false;
			return  check;
		}
	}
	return check;
}

}



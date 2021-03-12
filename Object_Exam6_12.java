package Object_orientde_Programming1;

public class Object_Exam6_12 {
//주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//모두 숫자로만 이루어져있으면 트루를 반환 아니면 펄스를 반환한다	
	public static void main(String[] args) {
		Object_Exam6_12 is = new Object_Exam6_12();
		String str = "3";
		System.out.println(str+"는 숫자입니가?"+is.isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니가?"+is.isNumber(str));
		
		str = "";
		System.out.println(str+"는 숫자입니가?"+is.isNumber(str));

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



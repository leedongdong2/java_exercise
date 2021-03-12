package Object_orientde_Programming1;

public class Object_Exam6_14 {
	
	public static void main(String[] args) {
		Object_Exam6_14 d = new Object_Exam6_14();
 int value = 5;
 System.out.println(value+"의 절대값:"+d.abs(value));
 value = -10;
 System.out.println(value+"의 절대값:"+d.abs(value));
	}

	
int abs(int value) {
	int change = Math.abs(value);
	
	return change;
}
}


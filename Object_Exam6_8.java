package Object_orientde_Programming1;
// 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
public class Object_Exam6_8 {
  int kind;
  int num;
  
  static int width;
  static int height;
  
  Object_Exam6_8(int k,int n){
	  kind = k;
	  num = n;
  }
  
  
  
	public static void main(String[] args) {
	System.out.println("(멤버변수) 클래스변수(staic변수)(클래스가 메모리에 적재될떄 바로생성) : width,height ");
	System.out.println("(멤버변수) 인스턴스 변수(인스턴스생성시생성) : kind,num ");
	System.out.println("지역변수 : (매개변수) (기본형)int k int n (객체형)card ");

	}

}

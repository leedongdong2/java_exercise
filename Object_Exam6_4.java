package Object_orientde_Programming1;
//스튜던트 클래스에 다음과 같이 정의된 두개의 메서드 gettotal과 getavg를 추가하여 실행시키시오
public class Object_Exam6_4 {

	public static void main(String[] args) {
	E6_4Student s = new E6_4Student();
	s.name = "홍길동";
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	
	int total = s.getTotal();
	double avg = s.getavg();
	
	System.out.println("이름:"+s.name);
	System.out.println("총점:"+ total);
    System.out.printf("평균:%.2f\n",avg);
    
	System.out.println("=================구분======================");
    E6_4Student s1 = new E6_4Student("홍길이",2,2,40,70,40);
    System.out.println("이름:"+s.name);
	System.out.println("총점:"+ s.getTotal());
    System.out.printf("평균:%.2f\n",s.getavg());
    

    

	}

}

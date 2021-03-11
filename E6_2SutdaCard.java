package Object_orientde_Programming1;
//섯다카드 클래스의 생성자와 인포를 추가해서 실행결과르 ㄹ얻으시오
public class E6_2SutdaCard {
   int num;
   boolean isKwang;//멤버변수
   
   E6_2SutdaCard(int num,boolean isKwang){//지역변수
	   this.num = num;// this-현재 클래스 멤버변수에 지역변수대입
	   this.isKwang = isKwang;
   }
   
   public void info(){
	 System.out.print(num);
	 if(isKwang==true) {
		 System.out.print("k");
	 }
   }
   
}

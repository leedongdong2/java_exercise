package Object_orientde_Programming1;
//��Ʃ��Ʈ Ŭ������ ������ ���� ���ǵ� �ΰ��� �޼��� gettotal�� getavg�� �߰��Ͽ� �����Ű�ÿ�
public class E6_4Student {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  
  
  E6_4Student(){}
  
  E6_4Student(String name,int ban,int no,int kor,int eng,int math){
	  this.name = name;
	  this.ban = ban;
	  this.no = no;
	  this.kor = kor;
	  this.eng = eng;
	  this.math = math;
  }
  
  public int getTotal() {
	 int total = kor+eng+math;
	 return total;
  }
  
  public double getavg() {
	  double avg = (double)(kor+eng+math)/3;
	  return avg;
  }
  
 
   
}

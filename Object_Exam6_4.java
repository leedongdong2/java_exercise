package Object_orientde_Programming1;
//��Ʃ��Ʈ Ŭ������ ������ ���� ���ǵ� �ΰ��� �޼��� gettotal�� getavg�� �߰��Ͽ� �����Ű�ÿ�
public class Object_Exam6_4 {

	public static void main(String[] args) {
	E6_4Student s = new E6_4Student();
	s.name = "ȫ�浿";
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	
	int total = s.getTotal();
	double avg = s.getavg();
	
	System.out.println("�̸�:"+s.name);
	System.out.println("����:"+ total);
    System.out.printf("���:%.2f\n",avg);
    
	System.out.println("=================����======================");
    E6_4Student s1 = new E6_4Student("ȫ����",2,2,40,70,40);
    System.out.println("�̸�:"+s.name);
	System.out.println("����:"+ s.getTotal());
    System.out.printf("���:%.2f\n",s.getavg());
    

    

	}

}

package Object_orientde_Programming1;
//����ī�� Ŭ������ �����ڿ� ������ �߰��ؼ� �������� �������ÿ�
public class E6_2SutdaCard {
   int num;
   boolean isKwang;//�������
   
   E6_2SutdaCard(int num,boolean isKwang){//��������
	   this.num = num;// this-���� Ŭ���� ��������� ������������
	   this.isKwang = isKwang;
   }
   
   public void info(){
	 System.out.print(num);
	 if(isKwang==true) {
		 System.out.print("k");
	 }
   }
   
}

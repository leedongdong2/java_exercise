package Object_orientde_Programming1;
// ������ ��ǻ�� ������ ���� �� Ŭ������ ������ ���̴� �� Ŭ������ ��� (marine) .
// �� Ŭ������ ������ ���̴� (marine) .�߿� �� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ� static  �� �ٿ��� �ϴ� ���� � �͵��̰� 
// �� ������ �����ΰ� static ?( , .�� ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�
public class Object_Exam6_9 {
int x=0,y=0;
int hp = 60;
static int weapon = 6;
static int armor = 0;

void weaponUp() {
	weapon++;
}

void armorUp() {
	armor++;
}

void move(int x,int y) {
	this.x=  x;
	this.y = y;
}

public static void main(String[] args) {
	System.out.println("��� ������ ���ݷ°� ������ ���ƾ��ϴ� weapon,armor�� �ٿ� Ŭ�������� �ѹ��� �ٲ�� �ֵ��� ������Ѵ�");
	int i = 2;
	String e = "*";
	System.out.println(i+e+i);
	
}
}
